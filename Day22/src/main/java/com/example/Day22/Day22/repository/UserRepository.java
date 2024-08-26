package com.example.Day22.Day22.repository;


import com.example.Day22.Day22.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository {

    @Autowired
   JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public default void addUser(User user) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
    }


    public default User getUserById(Long id) {
        String sql = "SELECT * FROM users WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, userRowMapper());
    }

    public default void updateUserEmail(Long id, String newEmail) {
        String sql = "UPDATE users SET email = ? WHERE id = ?;";
        jdbcTemplate.update(sql, newEmail, id
        );
    }

    public default void addUsers(List<User> users) {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        jdbcTemplate.batchUpdate(sql, users, users.size(), (ps, user) -> {
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
        });
    }
    public default void deleteUser(Long id) {
        String sql = "DELETE FROM users WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public default List<User> getAllUsers() {
        String sql = "SELECT * FROM users";
        return jdbcTemplate.query(sql, userRowMapper());
    }

    private RowMapper<User> userRowMapper() {
        return (rs, rowNum) -> {
            User user = new User();
            user.setId(rs.getLong("id"));
            user.setName(rs.getString("name"));
            user.setName(rs.getString("email"));
            return user;
        };
    }
}


package com.example.Day24.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;

        @OneToMany(mappedBy = "department")
        private List<Employee> employees = new ArrayList<>();

    }


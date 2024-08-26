package com.example.Day24.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // e.g., home, work
    private String address;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}

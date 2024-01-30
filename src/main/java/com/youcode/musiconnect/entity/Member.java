package com.youcode.musiconnect.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate joinDate;
    private int role;
    @ManyToOne
    private Person person;
    @ManyToOne
    private Community community;
}

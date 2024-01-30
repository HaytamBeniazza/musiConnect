package com.youcode.musiconnect.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate reservationDate;
    @ManyToOne
    private Event event;
    @ManyToOne
    private Person person;
}

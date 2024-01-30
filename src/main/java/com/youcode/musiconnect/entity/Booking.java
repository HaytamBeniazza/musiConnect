package com.youcode.musiconnect.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private LocalDate reservationDate;
    private LocalDate when;
    private LocalTime from;
    private LocalTime to;
    private String location;

    @ManyToOne
    private Gig gig;
    @ManyToOne
    private Person person;
}

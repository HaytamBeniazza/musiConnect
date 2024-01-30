package com.youcode.musiconnect.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime dateAndTime;
    @ManyToOne
    private Person sender;
    @ManyToOne
    private Person receiver;

}

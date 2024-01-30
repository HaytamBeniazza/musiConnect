package com.youcode.musiconnect.entity;

import com.youcode.musiconnect.enums.MediaType;
import jakarta.persistence.*;

@Entity
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String src;
    private MediaType mediaType;

    @ManyToOne
    private Post post;
}

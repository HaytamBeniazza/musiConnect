package com.youcode.musiconnect.entity;

import com.youcode.musiconnect.enums.ArtType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

//@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Artist extends Person{
    private String genre;
    private boolean verified;
    private String verificationDoc;
    private boolean busy;
    private ArtType artType;

    @OneToMany(mappedBy = "artist", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Event> events;
}

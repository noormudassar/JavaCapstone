package com.devmountain.capstone.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Favorite")
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}

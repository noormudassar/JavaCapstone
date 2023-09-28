package com.devmountain.capstone.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Favorite")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JsonBackReference
    private User user;

//    @ManyToMany
//    @JsonBackReference
//    private Jewelry jewelry;
}


// I NEED TO ADD RELATIONSHIPS BETWEEN JEWELRY AND FAVORITES AND USERS AND FAVORITES
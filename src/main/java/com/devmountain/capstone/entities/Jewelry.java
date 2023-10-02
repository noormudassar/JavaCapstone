package com.devmountain.capstone.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Jewelry")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jewelry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String jewelry_type;

    @Column
    private String jewelry_name;

    @Column
    private String jewelry_image;

    @ManyToOne
    @JsonBackReference
    private User user;
}

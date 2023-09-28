package com.devmountain.capstone.entities;

import com.devmountain.capstone.dtos.JewelryDto;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

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

//    @ManyToMany(mappedBy = "jewelry", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
//    private Set<Favorite> favoriteSet = new HashSet<>();

    public Jewelry(JewelryDto jewelryDto) {
        if (jewelryDto.getJewelry_name() != null) {
            this.jewelry_name = jewelryDto.getJewelry_name();
        }
        if (jewelryDto.getJewelry_type() != null) {
            this.jewelry_type = jewelryDto.getJewelry_type();
        }
        if (jewelryDto.getJewelry_image() != null) {
            this.jewelry_image = jewelryDto.getJewelry_image();
        }
    }
}

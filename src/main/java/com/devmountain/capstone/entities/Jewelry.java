package com.devmountain.capstone.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Jewelry")
public class Jewelry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String jewelry_type;

    @Column
    private String jewelry_name;

    public Jewelry(Long id, String jewelry_type, String jewelry_name) {
        this.id = id;
        this.jewelry_type = jewelry_type;
        this.jewelry_name = jewelry_name;
    }

    public Jewelry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJewelry_type() {
        return jewelry_type;
    }

    public void setJewelry_type(String jewelry_type) {
        this.jewelry_type = jewelry_type;
    }

    public String getJewelry_name() {
        return jewelry_name;
    }

    public void setJewelry_name(String jewelry_name) {
        this.jewelry_name = jewelry_name;
    }
}

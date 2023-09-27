package com.devmountain.capstone.dtos;

import com.devmountain.capstone.entities.Jewelry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JewelryDto implements Serializable {
    private Long id;
    private String jewelry_type;
    private String jewelry_name;
    private String jewelry_image;
    private UserDto userDto;
    private FavoriteDto favoriteDto;

    public JewelryDto(Jewelry jewelry) {
        if (jewelry.getId() != null) {
            this.id = jewelry.getId();
        }
        if (jewelry.getJewelry_type() != null) {
            this.jewelry_type = jewelry.getJewelry_type();
        }
        if (jewelry.getJewelry_name() != null) {
            this.jewelry_name = jewelry.getJewelry_name();
        }
        if (jewelry.getJewelry_image() != null) {
            this.jewelry_image = jewelry.getJewelry_image();
        }
    }
}

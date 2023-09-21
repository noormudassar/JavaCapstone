package com.devmountain.capstone.dtos;

import com.devmountain.capstone.entities.Favorite;
import com.devmountain.capstone.entities.Jewelry;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteDto implements Serializable {
    public Long id;
    public UserDto userDto;
    public JewelryDto jewelryDto;

    public FavoriteDto(Favorite favorite) {
        if (favorite.getId() != null) {
            this.id = favorite.getId();
        }
    }
}

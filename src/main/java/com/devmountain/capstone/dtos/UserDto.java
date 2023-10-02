package com.devmountain.capstone.dtos;

import com.devmountain.capstone.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public UserDto(User user) {
        if (user.getId() != null) {
            this.id = user.getId();
        }
        if (user.getFirstname() != null) {
            this.firstname = user.getFirstname();
        }
        if (user.getLastname() != null) {
            this.lastname = user.getLastname();
        }
        if (user.getEmail() != null) {
            this.email = user.getEmail();
        }
        if (user.getPassword() != null) {
            this.password = user.getPassword();
        }
    }
}

package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.UserDto;

import java.util.List;

public interface UserService {
    List<String> addUser(UserDto userDto);

    List<String> userLogin(UserDto userDto);
}

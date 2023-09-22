package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.JewelryDto;
import com.devmountain.capstone.entities.Jewelry;
import com.devmountain.capstone.entities.User;
//import com.devmountain.capstone.repositories.JewelryRepository;
import com.devmountain.capstone.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JewelryServiceImpl {
    @Autowired
    private UserRepository userRepository;
//    @Autowired
//    private JewelryRepository jewelryRepository;

//    @Override
//    public List<JewelryDto> getAllJewelryByUserId(Long userId) {
//        Optional<User> userOptional = userRepository.findById(userId);
//        if (userOptional.isPresent()) {
//            List<Jewelry> jewelryList = jewelryRepository.findAllUsersEquals(userOptional.get());
//            return jewelryList.stream().map(jewelry -> new JewelryDto(jewelry)).collect(Collectors.toList());
//        }
//        return Collections.emptyList();
//    }
//    @Override
//    public Optional<JewelryDto> getJewelryById(Long jewelryId) {
//        Optional<Jewelry> jewelryOptional = jewelryRepository.findById(jewelryId);
//        if (jewelryOptional.isPresent()) {
//            return Optional.of(new JewelryDto(jewelryOptional.get()));
//        }
//        return Optional.empty();
//    }
}
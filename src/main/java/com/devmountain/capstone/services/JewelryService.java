package com.devmountain.capstone.services;

import com.devmountain.capstone.dtos.JewelryDto;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface JewelryService {
    // adding jewelry
    @Transactional
    void addJewelry(JewelryDto jewelryDto, Long userId);

    // deleting jewelry
    @Transactional
    void deleteJewelryById(Long jewelryId);

    // update jewelry
    @Transactional
    void updateJewelryById(JewelryDto jewelryDto);

    // finding all jewelry by user id
    List<JewelryDto> getAllJewelryByUserId(Long userId);

    // getting jewelry by jewelry id
    Optional<JewelryDto> getJewelryById(Long jewleryId);
}

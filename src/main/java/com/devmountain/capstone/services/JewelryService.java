//package com.devmountain.capstone.services;
//
//import com.devmountain.capstone.dtos.JewelryDto;
//import jakarta.transaction.Transactional;
//
//import java.util.List;
//import java.util.Optional;
//
//public interface JewelryService {
//    @Transactional
//    void addJewelry(JewelryDto jewelryDto, Long userId);
//
//    @Transactional
//    void deleteJewelryById(Long jewelryId);
//
//    @Transactional
//    void updateJewelryById(JewelryDto jewelryDto);
//
//    // finding all jewelry by user id
//    List<JewelryDto> getAllJewelryByUserId(Long userId);
//
//    Optional<JewelryDto> getJewelryById(Long jewleryId);
//}

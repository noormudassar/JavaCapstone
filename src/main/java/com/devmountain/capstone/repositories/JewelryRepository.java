//package com.devmountain.capstone.repositories;
//
//import com.devmountain.capstone.dtos.JewelryDto;
//import com.devmountain.capstone.entities.Jewelry;
//import com.devmountain.capstone.entities.User;
//import jakarta.transaction.Transactional;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Repository
//public interface JewelryRepository extends JpaRepository<Jewelry, Long> {
//    List<Jewelry> findAllByUserEqual(User user);
//
//    @Transactional
//    void addJewelry(JewelryDto jewelryDto, Long userId) ;
//
//    @Transactional
//    void deleteJewelryById(Long jewelryId);
//
//    @Transactional
//    void updateJewelryById(JewelryDto jewelryDto);
//
//    Optional<JewelryDto> getJewelryById(Long jewleryId);
//}

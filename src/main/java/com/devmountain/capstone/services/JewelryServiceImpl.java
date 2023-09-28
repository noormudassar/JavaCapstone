//package com.devmountain.capstone.services;
//
//import com.devmountain.capstone.dtos.JewelryDto;
//import com.devmountain.capstone.entities.Jewelry;
//import com.devmountain.capstone.entities.User;
////import com.devmountain.capstone.repositories.JewelryRepository;
//import com.devmountain.capstone.repositories.JewelryRepository;
//import com.devmountain.capstone.repositories.UserRepository;
//import jakarta.transaction.Transactional;
//import org.hibernate.query.derived.AnonymousTupleEmbeddableValuedModelPart;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.beans.Transient;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;
//
//@Service
//public class JewelryServiceImpl implements JewelryService {
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private JewelryRepository jewelryRepository;
//
//    // adding jewelry
//
//    @Override
//    @Transactional
//    public void addJewelry(JewelryDto jewelryDto, Long userId) {
//        Optional<User> userOptional = userRepository.findById((userId));
//        Jewelry jewelry = new Jewelry(jewelryDto);
//        userOptional.ifPresent(jewelry::setUser);
//        jewelryRepository.saveAndFlush(jewelry);
//    }
//    // deleting jewelry
//
//    @Override
//    @Transactional
//    public void deleteJewelryById(Long jewelryId) {
//        Optional<Jewelry> jewelryOptional = jewelryRepository.findById(jewelryId);
//        jewelryOptional.ifPresent(jewelry -> jewelryRepository.delete(jewelry));
//    }
//
//    // update jewelry
//
//    @Override
//    @Transactional
//    public void updateJewelryById(JewelryDto jewelryDto) {
//        Optional<Jewelry> jewelryOptional = jewelryRepository.findById(jewelryDto.getId());
//        jewelryOptional.ifPresent(jewelry -> {
//            jewelry.setJewelry_name(jewelryDto.getJewelry_name());
//            jewelry.setJewelry_type(jewelryDto.getJewelry_type());
//            jewelry.setJewelry_image(jewelryDto.getJewelry_image());
//            jewelryRepository.saveAndFlush(jewelry);
//        });
//    }
//
//    // finding all jewelry by user id
//    @Override
//    public List<JewelryDto> getAllJewelryByUserId(Long userId) {
//        Optional<User> userOptional = userRepository.findById((userId));
//        if (userOptional.isPresent()) {
//            List<Jewelry> jewelryList = jewelryRepository.findAllByUserEqual(userOptional.get());
//            return jewelryList.stream().map(jewelry -> new JewelryDto()).collect(Collectors.toList());
//        }
//        return Collections.emptyList();
//    }
//
//    // getting jewelry by jewelry id
//
//    @Override
//    public Optional<JewelryDto> getJewelryById(Long jewleryId) {
//        Optional<Jewelry> jewelryOptional = jewelryRepository.findById(jewleryId);
//        if(jewelryOptional.isPresent()) {
//            return Optional.of(new JewelryDto(jewelryOptional.get()));
//        }
//        return Optional.empty();
//    }
//}
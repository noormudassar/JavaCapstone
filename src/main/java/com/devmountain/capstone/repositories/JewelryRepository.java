package com.devmountain.capstone.repositories;

import com.devmountain.capstone.entities.Jewelry;
import com.devmountain.capstone.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JewelryRepository extends JpaRepository<Jewelry, Long> {
    List<Jewelry> findAllUsersEquals(User user);
}

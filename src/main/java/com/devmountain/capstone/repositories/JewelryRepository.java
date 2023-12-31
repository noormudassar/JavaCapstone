package com.devmountain.capstone.repositories;

import com.devmountain.capstone.entities.Jewelry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JewelryRepository extends JpaRepository<Jewelry, Long> {
}

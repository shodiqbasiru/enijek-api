package com.enigma.enijek.repository;

import com.enigma.enijek.entity.BrandMotorcycles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<BrandMotorcycles,String> {

    @Query("FROM BrandMotorcycles WHERE brandName = :brandName AND modelName = :modelName")
    List<BrandMotorcycles> findByBrandNameAndModelName(String brandName, String modelName);
    @Query("FROM BrandMotorcycles WHERE brandName LIKE %:brandName%")
    List<BrandMotorcycles> findAllByBrandName(String brandName);
}

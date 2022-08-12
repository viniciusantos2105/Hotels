package com.hotel.repository;

import com.hotel.entites.Bedrooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BedroomsRepository extends JpaRepository<Bedrooms, Long> {
}

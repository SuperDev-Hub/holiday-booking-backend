package com.example.sukumar.repository;

import com.example.sukumar.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    // Additional query methods can go here
}

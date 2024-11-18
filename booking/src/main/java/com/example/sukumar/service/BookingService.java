package com.example.sukumar.service;

import com.example.sukumar.model.Booking;
import com.example.sukumar.repository.BookingRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking); // Save the booking to the database
    }
}

package com.example.sukumar.controller;

import com.example.sukumar.model.Booking;
import com.example.sukumar.service.BookingService;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;  

    @PostMapping
    public ResponseEntity<?> bookRoom(@RequestBody Booking booking) {

        Booking savedBooking = bookingService.createBooking(booking);
        return ResponseEntity.ok(savedBooking);
    }
}

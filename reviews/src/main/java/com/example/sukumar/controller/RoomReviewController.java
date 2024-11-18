package com.example.sukumar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.sukumar.model.RoomReview;
import com.example.sukumar.service.RoomReviewService;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/rooms")
public class RoomReviewController {

    @Autowired
    private RoomReviewService reviewService;

    // Get reviews by room ID
    @GetMapping("/{roomId}/reviews")
    public ResponseEntity<List<RoomReview>> getReviews(@PathVariable Long roomId) {
        List<RoomReview> reviews = reviewService.getReviewsByRoomId(roomId);
        return ResponseEntity.ok(reviews);
    }

    // Post a new review
    @PostMapping("/{roomId}/reviews")
    public ResponseEntity<RoomReview> postReview(@PathVariable Long roomId, @RequestBody RoomReview review) {
        review.setRoomId(roomId);
        review.setDate(LocalDateTime.now()); // Set the current date
        RoomReview savedReview = reviewService.saveReview(review);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedReview);
    }
}

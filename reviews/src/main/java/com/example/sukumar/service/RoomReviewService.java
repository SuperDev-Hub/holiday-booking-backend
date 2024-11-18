package com.example.sukumar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sukumar.model.RoomReview;
import com.example.sukumar.repository.RoomreviewRepository;

import java.util.List;

@Service
public class RoomReviewService {

    @Autowired
    private RoomreviewRepository reviewRepository;

    public List<RoomReview> getReviewsByRoomId(Long roomId) {
        return reviewRepository.findByRoomId(roomId);
    }

    public RoomReview saveReview(RoomReview review) {
        return reviewRepository.save(review);
    }
}

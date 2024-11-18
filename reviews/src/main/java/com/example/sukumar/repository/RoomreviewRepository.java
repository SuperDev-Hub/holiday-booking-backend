package com.example.sukumar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sukumar.model.RoomReview;

import java.util.List;

@Repository
public interface RoomreviewRepository extends JpaRepository<RoomReview, Long> {
    List<RoomReview> findByRoomId(Long roomId);
}

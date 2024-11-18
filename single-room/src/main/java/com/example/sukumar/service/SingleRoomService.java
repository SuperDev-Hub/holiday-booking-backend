package com.example.sukumar.service;

import com.example.sukumar.model.SingleRoom;
import com.example.sukumar.repository.SingleRoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SingleRoomService {

    @Autowired
    private SingleRoomRepository singleRoomRepository;

    public List<SingleRoom> getAllRooms() {
        return singleRoomRepository.findAll();
    }
    
    public SingleRoom getRoomById(Long id) {
        // Use the injected repository to find the room by ID
        return singleRoomRepository.findById(id).orElse(null);  // Return null if room is not found
    }
}

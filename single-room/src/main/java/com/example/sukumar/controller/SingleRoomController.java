package com.example.sukumar.controller;

import com.example.sukumar.model.SingleRoom;
import com.example.sukumar.service.SingleRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/single-rooms")
@CrossOrigin(origins = "http://localhost:4200") // Enable CORS for Angular app
public class SingleRoomController {

    @Autowired
    private SingleRoomService singleRoomService;

    @GetMapping
    public List<SingleRoom> getAllRooms() {
        return singleRoomService.getAllRooms();
    }
    
    @GetMapping("/{id}")  // Map the URL to this method
    public ResponseEntity<SingleRoom> getRoomDetails(@PathVariable Long id) {
        // Use the injected service to fetch room details
        SingleRoom room = singleRoomService.getRoomById(id);
        
        if (room == null) {
            // Return 404 if room is not found
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        
        // Return the room details with status 200 OK
        return ResponseEntity.ok(room);
    }
}

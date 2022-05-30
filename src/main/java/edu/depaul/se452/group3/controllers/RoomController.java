package edu.depaul.se452.group3.controllers;

import edu.depaul.se452.group3.persistence.Room;
import edu.depaul.se452.group3.services.RoomService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.logging.Level;

//@RestController
@Controller
@RequestMapping("/rooms")
@Log
public class RoomController {
    @Autowired
    private RoomService service;

    @GetMapping("/")
    public List<Room> getAllRooms() {
        List<Room> rooms = service.findAll();
        log.log(Level.SEVERE, rooms.toString());
        return rooms;
    }

//    @GetMapping("/")
//    public String getAllRooms(Model model) {
//        List<Room> rooms = service.findAll();
//        log.log(Level.SEVERE, rooms.toString());
//        model.addAttribute("rooms", rooms);
//        return "rooms/list";
//    }

    @GetMapping("/{id}")
    public ResponseEntity<Room> read(@PathVariable("id") Long id) {
        Optional<Room> foundRoom = service.find(id);

        if (foundRoom.isPresent()) {
            log.log(Level.INFO, foundRoom.get().toString());
            return ResponseEntity.ok(foundRoom.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}

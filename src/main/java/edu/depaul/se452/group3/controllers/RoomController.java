package edu.depaul.se452.group3.controllers;

import edu.depaul.se452.group3.persistence.Room;
import edu.depaul.se452.group3.services.RoomService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.naming.Binding;
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

//    @GetMapping("/")
//    public List<Room> getAllRooms() {
//        List<Room> rooms = service.findAll();
//        log.log(Level.SEVERE, rooms.toString());
//        return rooms;
//    }

    @GetMapping("/")
    public String getAllRooms(Model model) {
        List<Room> rooms = service.findAll();
        model.addAttribute("rooms", rooms);
        log.log(Level.SEVERE, rooms.toString());
        return "rooms/list";
    }

    @PostMapping("/add")
    public String add(@Validated Room room, BindingResult result, Model model){
        if(result.hasErrors()) {
            return "rooms/edit";
        }
        service.save(room);
        return "redirect:/rooms";
    }

    @GetMapping("/add")
    public String add(Room room, Model model){
        model.addAttribute("room", room);
        return "rooms/edit";
    }


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

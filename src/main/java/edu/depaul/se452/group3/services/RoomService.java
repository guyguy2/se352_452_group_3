package edu.depaul.se452.group3.services;

import edu.depaul.se452.group3.persistence.Room;
import edu.depaul.se452.group3.persistence.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoomService {
    @Autowired
    private RoomRepository repo;

    public List<Room> findAll() {
        return repo.findAll();
    }

    public Optional<Room> find(long id) {
        return repo.findById(id);
    }

    public void save(Room room) {
        repo.save(room);
    }
}

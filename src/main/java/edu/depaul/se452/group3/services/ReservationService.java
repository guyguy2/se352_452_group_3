package edu.depaul.se452.group3.services;

import edu.depaul.se452.group3.persistence.Reservation;
import edu.depaul.se452.group3.persistence.ReservationRepository;
import edu.depaul.se452.group3.persistence.Room;
import edu.depaul.se452.group3.persistence.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {
    @Autowired
    private ReservationRepository repo;

    public List<Reservation> findAll() {
        return repo.findAll();
    }

    public Optional<Reservation> find(long id) {
        return repo.findById(id);
    }

    public void save(Reservation reservation) {
        repo.save(reservation);
    }
}

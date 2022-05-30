package edu.depaul.se452.group3.persistence;

import org.springframework.data.jpa.repository.JpaRepository;


public interface RoomRepository extends JpaRepository<Room, Long> {
    Room findByNumber(int name);
}

package edu.depaul.se452.group3.persistence;

import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface RoomRepository extends CrudRepository<Room, Long> {
    Room findByNumber(int name);
}

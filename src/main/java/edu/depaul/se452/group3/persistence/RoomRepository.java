package edu.depaul.se452.group3.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


public interface RoomRepository extends CrudRepository<Room, Long> {

}

package edu.depaul.se452.group3.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository

public interface RoomRepository extends JpaRepository<Room, Long> {
    Room findByNumber(int name);


}

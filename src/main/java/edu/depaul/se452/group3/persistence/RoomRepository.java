package edu.depaul.se452.group3.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
    @Query (value = "SELECT * FROM Room WHERE number = ?1", nativeQuery = true)
    Room findByNumber(int number);

}

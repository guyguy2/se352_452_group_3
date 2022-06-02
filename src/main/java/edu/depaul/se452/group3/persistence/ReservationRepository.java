
package edu.depaul.se452.group3.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
//    @Query(value = "SELECT * FROM Reservation WHERE checkInDate = ?1", nativeQuery = true)
//    List<Reservation> findByCheckInDate(String checkInDate);
//
//    @Query (value = "SELECT * FROM Reservation WHERE checkOutDate = ?1", nativeQuery = true)
//    List<Reservation> findByCheckOutDate(String checkOutDate);
//
//    @Query (value = "SELECT * FROM Reservation WHERE numOfRooms = ?1", nativeQuery = true)
//    List<Reservation> findByNumOfRooms(int numOfRooms);

}

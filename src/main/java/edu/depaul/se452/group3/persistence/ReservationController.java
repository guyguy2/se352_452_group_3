package edu.depaul.se452.group3.persistence;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class ReservationController {
    @Autowired
    
    @RequestMapping(path = {"/","/search"})
    public String search(@Param("checkInDate") String checkInDate, @Param("checkOutDate") String checkOutDate, @Param("checkInTime") String checkInTime, @Param("checkOutTime") String checkOutTime, @Param("numOfRooms") int numOfRooms, Model model) {
        if(checkInDate != null && checkOutDate != null && checkInTime != null && checkOutTime != null) {
 
        return checkInDate;

        

    }
        return checkOutTime;
 

}

}
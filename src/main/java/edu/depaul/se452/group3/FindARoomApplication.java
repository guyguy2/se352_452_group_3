package edu.depaul.se452.group3;

import edu.depaul.se452.group3.persistence.Reservation;
import edu.depaul.se452.group3.persistence.ReservationRepository;
import edu.depaul.se452.group3.persistence.Room;
import edu.depaul.se452.group3.persistence.RoomRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
@Service

@SpringBootApplication
public class FindARoomApplication {
    @Autowired
    
    @Value("${app.greeting}")
    private String greeting;

    public static void main(String[] args) {
        SpringApplication.run(FindARoomApplication.class, args);
    }

    @Bean
    public void hello() { ///remove
        System.out.println("*** Hello Group 3 ***");

    }

    @Bean
    public CommandLineRunner showRooms(RoomRepository repository) {
        return (args) -> {
            // fetch all
            repository.findAll().forEach((room) -> {
                System.out.println(room);
            });
        };
    }

    public CommandLineRunner FindRoom(RoomRepository repository) {
        return (args) -> {
            // fetch all
            repository.findAll().forEach((room) -> {
                System.out.println(room);
            });
        };
    }

    public List<Room> getAllRooms(RoomRepository repository){
        List<Room> list =  (List<Room>)repository.findAll();
        return list;
       }
       
       /*
        * TODO: Get Shop By keyword
        */
       public List<Reservation> getByDate(ReservationRepository repository){
        return repository.findByCheckInDate("2019-01-01");
       }



}
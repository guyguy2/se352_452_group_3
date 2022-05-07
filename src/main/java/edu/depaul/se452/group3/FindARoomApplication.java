package edu.depaul.se452.group3;

import edu.depaul.se452.group3.persistence.Room;
import edu.depaul.se452.group3.persistence.RoomRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class FindARoomApplication {
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
            System.out.println("Find all:");
            repository.findAll().forEach((room) -> {
                System.out.println(room);
            });
        };
    }

    @Bean
    public CommandLineRunner FindRoomByNumber(RoomRepository repository) {
        System.out.println("FindRoomByName: ");

        return (args) -> {
            Room results = repository.findByNumber(101);
            System.out.println(results);
        };
    }



}
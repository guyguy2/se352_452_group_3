package edu.depaul.se452.group3.persistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestMapping;

import lombok.Data;

@Data
@Entity
@RequestMapping("/room")
public class Room {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    private int number;
    private String features;
}

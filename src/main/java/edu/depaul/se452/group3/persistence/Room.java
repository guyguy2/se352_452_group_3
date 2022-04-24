package edu.depaul.se452.group3.persistence;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Room {
    @Id
    @GeneratedValue
    private long id;

    private int number;
    private List<String> feartures;
}

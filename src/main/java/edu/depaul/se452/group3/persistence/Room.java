package edu.depaul.se452.group3.persistence;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Room {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    //@Column(name="num")
    private int number;
    
    //@Column(name="desc")
    private String description;

    //@Column(name="amenities")
    private String amenities;

    //@Column(name="stat")
    private String status;

    //@Column(name="price")
    private double price;

}

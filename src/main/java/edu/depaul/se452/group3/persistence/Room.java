package edu.depaul.se452.group3.persistence;


import javax.persistence.*;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString
@Table(name = "Rooms")
public class Room {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    @Column(name="number")
    private int number;
    
    @Column(name="description")
    private String description;

    @Column(name="amenities")
    private String amenities;

    @Column(name="status")
    private String status;

    @Column(name="price")
    private double price;

}

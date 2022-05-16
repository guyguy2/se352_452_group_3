package edu.depaul.se452.group3.persistence;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String address;

    @OneToMany (fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    @JoinTable(name = "HOTEL_ROOMS", joinColumns = { @JoinColumn(name = "hotel_id", referencedColumnName = "id") })
    @ToString.Exclude
    private List<Room> rooms;

    @OneToMany (fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    @JoinTable(name = "HOTEL_CUSTOMERS", joinColumns = { @JoinColumn(name = "hotel_id", referencedColumnName = "id") })
    @ToString.Exclude
    private List<Customer> customers;

}

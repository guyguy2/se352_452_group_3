package edu.depaul.se452.group3.persistence;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Data
@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @Column(nullable = false, updatable = false)

    @GeneratedValue(
            strategy = GenerationType.IDENTITY,
            generator = "primary_sequence"
    )
    private Long id;

    @Column
    private LocalDate checkInDate;

    @Column
    private LocalDate checkOutDate;

//    @Column
//    private Integer numOfRooms;

    @OneToMany (fetch = FetchType.EAGER)
    @Fetch(value = FetchMode.SUBSELECT)
    @JoinTable(name = "RESERVATION_ROOMS", joinColumns = { @JoinColumn(name = "reservation_id", referencedColumnName = "id") })
    @ToString.Exclude
    private List<Room> rooms;

    @OneToMany(mappedBy="id",fetch=FetchType.LAZY,cascade = CascadeType.PERSIST)
    private List<Customer> customers = new ArrayList<>();

}

package edu.depaul.se452.group3.persistence;

import java.time.LocalDate;
import java.time.LocalTime;
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

@Entity
@Getter
@Setter
@Table(name = "reservation")
@RequestMapping(path = {"/","/search"})
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

    @Column
    private LocalTime checkInTime;

    @Column
    private LocalTime checkOutTime;

    @Column
    private Integer numOfRooms;


}

package edu.depaul.se452.group3.persistence;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @Column(nullable = false, updatable = false)
    @SequenceGenerator(
            name = "primary_sequence",
            sequenceName = "primary_sequence",
            allocationSize = 1,
            initialValue = 10000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
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

    @OneToMany (fetch = FetchType.EAGER)
    @JoinTable(name = "RESERVATION_ROOMS", joinColumns = { @JoinColumn(name = "reservation_id", referencedColumnName = "id") })
    @ToString.Exclude
    private List<Room> rooms;

}

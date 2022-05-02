package edu.depaul.se452.group3.persistence;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Hotel {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;
    private String address;

    @Column
    @ElementCollection(targetClass=Room.class)
//    @OneToMany // (fetch = FetchType.EAGER)
//    @JoinTable(name = "COURSE_STUDENTS", joinColumns = { @JoinColumn(name = "course_id", referencedColumnName = "id") })
//    @ToString.Exclude
    private List<Room> rooms;

}

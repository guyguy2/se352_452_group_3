package edu.depaul.se452.group3.persistence;


import java.util.List;
import javax.persistence.*;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Data
@Entity
@Table(name = "customers")
public class Customer {
    @Id
	@GeneratedValue
	private long id;
	
	@Column(name = "cust_ID")
	private String customerID;

	@Column(name = "name")
	private String name;

	private String email;

	@Column(name = "ph")
	private String customerPhone;

	@OneToMany (fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	@JoinTable(name = "CUSTOMER_ROOMS", joinColumns = { @JoinColumn(name = "customer_id", referencedColumnName = "id") })
	@ToString.Exclude
	private List<Room> rooms;

	@OneToMany (fetch = FetchType.EAGER)
	@JoinTable(name = "CUSTOMER_RESERVATION", joinColumns = { @JoinColumn(name = "customer_id", referencedColumnName = "id") })
	@ToString.Exclude
	private List<Reservation> reservations;





}

package edu.depaul.se452.group3.persistence;


import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "Customer")
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

//	@OneToMany(targetEntity=Reservation.class, mappedBy="id", fetch=FetchType.EAGER)
//	private List <Reservation> reservations;

}

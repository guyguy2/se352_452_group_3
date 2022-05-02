package edu.depaul.se452.group3.persistence;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name = "Customers")
public class Customer {
    @Id
	@GeneratedValue
	private long id;
	
	@Column(name = "cust_ID")
	private String customerID;

	@Column(name = "nm")
	private String customerName;

	@Email(message = "not valid email address format")
	private String customerEmail;

	@Column(name = "ph")
	private String customerPhone;

	private List <Reservation> reservations; 


}

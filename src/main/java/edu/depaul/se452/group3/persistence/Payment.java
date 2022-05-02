package edu.depaul.se452.group3.persistence;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Payment {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    //Customer customer

    //PaymentInfo PaymentInfo

    private double amountDue;

}

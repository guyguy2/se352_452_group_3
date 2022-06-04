package edu.depaul.se452.group3.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import edu.depaul.se452.group3.persistence.Customer;
import edu.depaul.se452.group3.persistence.Reservation;
import edu.depaul.se452.group3.services.ReservationService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//TODO - save, load, link with customer data, success/failure message
@Controller
@RequestMapping("/reservations")
@Log
public class ReservationController {

    @Autowired
    private ReservationService service;

    @GetMapping("/")
    public String getAllReservations() {
        List<Reservation> reservations = service.findAll();
        log.log(Level.SEVERE, reservations.toString());
        System.out.println(reservations);///
//        model.addAttribute("rooms", rooms);
        return "rooms/list";
    }

    //TODO use encryption for CC information
    @GetMapping(path = {"/process"}) //save
    public String process(@RequestParam("name") String name,
                          @RequestParam("email") String email,
                          @RequestParam("tel") String tel,
                          @RequestParam("from_date") String from_date,
                          @RequestParam("end_date") String end_date,
                          @RequestParam("cc_exp") String cc_exp,
                          @RequestParam("cvv") String cvv ){
        System.out.println("process");

        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        customer.setCustomerPhone(tel);
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);

        Reservation reservation = new Reservation();
        if (StringUtils.hasText(from_date)) {
            reservation.setCheckInDate(LocalDate.parse(from_date));
        }
        if (StringUtils.hasText(end_date)) {
            reservation.setCheckOutDate(LocalDate.parse(end_date));
        }
        reservation.setCustomers(customers);
        service.save(reservation);

        return "reservations/reservationConfirm";
    }

    //getById
    @GetMapping("/{id}") //save
    public String getReservation(@PathVariable String id) {
        System.out.println("getReservation");


        return "reservations/reservationInfo";
    }
}
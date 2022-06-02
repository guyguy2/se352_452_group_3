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
import org.springframework.web.bind.annotation.GetMapping;
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
                          @RequestParam("from_date") String from_date,
                          @RequestParam("end_date") String end_date,
                          @RequestParam("cc_exp") String cc_exp,
                          @RequestParam("cvv") String cvv ){
        System.out.println("process");

        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        List<Customer> customers = new ArrayList<>();
        customers.add(customer);

        Reservation reservation = new Reservation();
        reservation.setCheckInDate(LocalDate.now());
        reservation.setCheckOutDate(LocalDate.now());
        reservation.setCustomers(customers); ///
        service.save(reservation);
        //on success

        //on failure

        return "reservation"; ///fix
    }

    //getById
    @GetMapping(path = {"/{id}"}) //save
    public String getReservation(@RequestParam("id") String id) {
        System.out.println("getReservation");


        return "reservation";
    }
}
package Model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Setter

@Getter
public class Customer extends Person {


    private final Date joinDate;
    private List<Order> orders;
    private String sector;



    public Customer(String name, String surName, String sector) {
        super(name, surName);
        this.joinDate = new Date();
        this.sector = sector;
    }

    public Customer(String name, String surName, List<Order> orders, String sector) {
        super(name, surName);
        this.orders = orders;
        this.joinDate = new Date();
        this.sector = sector;
    }





}

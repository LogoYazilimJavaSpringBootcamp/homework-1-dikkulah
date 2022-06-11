package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Customer extends Person {
    private final Date joinDate;
    private  List<Order> orders = new ArrayList<>();
    private String sector;



    public Customer(String name, String surName, String sector) {
        super(name, surName);

        this.joinDate = new Date();
        this.sector = sector;
    }
    // farklı tarihte kayıt eklmek için
    public Customer(String name, String surName, List<Order> orders, String sector) {
        super(name, surName);
        this.orders = orders;
        this.joinDate = new Date();
        this.sector = sector;
    }



    @Override
    public String toString() {
        return super.toString() + " " + joinDate.toString() + " " + sector;
    }

    public String toStringFullName() {
        return super.toStringNoId();
    }


}

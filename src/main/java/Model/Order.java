package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Order extends Identifier {

    private Customer customer;
    private List<Product> products;
    private Double totalPrice;


    public Order(Customer customer, List<Product> products, Double  totalPrice) {
        this.customer = customer;
        this.products = products;
        this.totalPrice = totalPrice;
    }
}

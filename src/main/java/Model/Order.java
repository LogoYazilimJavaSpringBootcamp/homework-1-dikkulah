package Model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class Order extends Identifier {

    private Customer customer;
    private List<Product> products;
    private  Double totalPrice;
    private Date orderDate;




    public Order(Customer customer, List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.orderDate = new Date();
        this.totalPrice = calcPrice(products);

    }

    public Order(Customer customer, List<Product> products,  Date orderDate) {
        this.customer = customer;
        this.products = products;
        this.totalPrice = calcPrice(products);
        this.orderDate = orderDate;
    }


    private static Double calcPrice(List<Product> productList) {
        var price = productList.stream().map(Product::getPrice).toList();
        double sum = 0;
        for (Double value : price) {
            sum += value;
        }
        return sum;
    }



    @Override
    public String toString() {
        return super.toString() +
                " |" + customer.toStringFullName() +
                " |" + products.toString() +
                " |" + totalPrice +"₺"+
                '}';
    }



}

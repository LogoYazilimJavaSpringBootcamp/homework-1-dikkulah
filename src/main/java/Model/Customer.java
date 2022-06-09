package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends Person {
    private double money;
    private List<Order> orders;


    public void buy(Customer customer, Product product) {

    }


}

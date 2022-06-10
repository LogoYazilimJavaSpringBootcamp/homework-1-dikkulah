package Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product extends Identifier {

    private String name;
    private double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return

                " " + name  +
                " " + price;
    }
}

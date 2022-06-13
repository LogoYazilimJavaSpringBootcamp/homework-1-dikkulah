package Model;

import lombok.Getter;
import lombok.Setter;


public class Meat extends Product{
    public Meat() {
    }

    public Meat(String name, Double price) {
        super(name, price);
        super.setInfo("Et");
    }

    public Meat(String name, double price, String info) {
        super(name, price, info);
    }

    @Override
    public String productInfo() {
        return super.productInfo()+"\n --------";
    }
}

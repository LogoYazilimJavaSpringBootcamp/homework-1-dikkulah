package Model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Product extends Identifier {

    private String name;
    private double price;
    private String info="----";

    public Product() {
        this("Yok",0,"yok");
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        setInfo(info);
    }

    public Product(String name, double price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
        setInfo(info);

    }

    public void setInfo(String info) {
        this.info = "Ürün adı : "+getName()
                +"\n Ürün fiyatı:"+getPrice()
                +"\n Tür: "+ info;
    }

    public String productInfo(){
        return "< Ürün Bilgileri >\n-------------------\n"+getInfo();
    }
    @Override
    public String toString() {
        return

                " " + name  +
                " " + price;
    }
}

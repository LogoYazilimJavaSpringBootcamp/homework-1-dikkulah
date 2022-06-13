package Model;




public class Fruit extends Product{

    public Fruit(String name, Double price) {
        super(name, price);
        super.setInfo("Meyve");
    }

    public Fruit(String name, double price, String info) {
        super(name, price, info);

    }

    @Override
    public String productInfo() {
        return super.productInfo()+"\n ---------------";
    }


}

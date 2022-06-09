import Model.Customer;
import Model.Product;
import Service.CustomerImp;
import Service.CustomerService;

public class Main {
    static CustomerService customerService = new CustomerImp();


    public static void main(String[] args) {

        Product elma = new Product("Elma", 20.0);
        Product karpuz = new Product("Karpuz", 50.0);
        Product telefon = new Product("Telefon", 1000.0);
        Product et = new Product("Kırmızı et", 150.0);
        Customer ufuk = new Customer("Ufuk", "Dikkülah", "Yazılım");
        Customer ahmet = new Customer("Ahmet", "Yılmaz", "Yazılım");
        Customer tugce = new Customer("Tuğçe", "Eren", "Turizm");
        Customer zeynep = new Customer("Zeynep", "Kıran", "Turizm");
        Customer ceyhun = new Customer("Ceyhun", "Melek", "Emlak");

        customerService.save(ufuk);
        customerService.save(ahmet);
        customerService.save(tugce);
        customerService.save(ceyhun);
        customerService.save(zeynep); // Yeni Müşteri kayıt


        customerService.printAll(); //Tüm Müşterileri listeli
        System.out.println("---------------------");
        customerService.findByContainsLetter("C"); // C ierenleri listele
    }
}

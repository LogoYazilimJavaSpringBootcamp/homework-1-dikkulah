package Service;

import Model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerImp implements CustomerService {

    static List<Customer> allCustomers = new ArrayList<>(20); // kayıt görevi görüyor

    @Override
    public void save(Customer customer) {
        allCustomers.add(customer);
    }

    @Override
    public void findByContainsLetter(String letter) {
        System.out.println("|----------  " + letter + " Harfini içerenler----|");
        allCustomers.stream()
                .map(Customer::toStringFullName)
                .filter(s -> (s.contains(letter.toLowerCase()) || s.contains(letter.toUpperCase())))
                .forEach(System.out::println);
    }


    @Override
    public void printAll() {
        AtomicInteger i = new AtomicInteger(0);
        System.out.println("|-------------------------------Tüm Müşteriler-------------------------------| ");
        System.out.println("|----------------------CUSTOMER ID-----------|------------NAME-SURNAME---₺---|");
        allCustomers.stream()
                .map(Customer::toString)
                .forEach(System.out::println);
    }
}

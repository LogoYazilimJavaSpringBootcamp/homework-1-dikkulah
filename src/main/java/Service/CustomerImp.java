package Service;

import Model.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CustomerImp implements CustomerService {

    List<Customer> allCustomers = new ArrayList<>(20); // kayıt görevi görüyor

    @Override
    public void save(Customer customer) {
        allCustomers.add(customer);
    }

    @Override
    public void findByContainsLetter(String letter) {
        System.out.println("Harfini içerenler");
        allCustomers.stream()
                .map(customer -> ("  " + customer.getName() + " " + customer.getSurName()))
                .filter(s -> (s.contains(letter.toLowerCase()) || s.contains(letter.toUpperCase())))
                .forEach(System.out::println);
    }

    @Override
    public void printAll() {
        AtomicInteger i = new AtomicInteger(0);
        System.out.println("Tüm müşteriler");
        allCustomers.stream()
                .map(customer -> (i.incrementAndGet() + ") " + customer.getName() + " " + customer.getSurName()))
                .forEach(System.out::println);
    }
}

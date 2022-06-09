package Service;

import Model.Customer;

import java.util.List;

public interface CustomerService {
    void save(Customer customer);

    void findByContainsLetter(String letter); // içerisinde c olanlar için

    void printAll();


}

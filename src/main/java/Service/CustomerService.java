package Service;

import Model.Customer;

public interface CustomerService {
    void save(Customer customer);

    void findByContainsLetter(String letter); // içerisinde c olanlar için

    void printAll();

    void getSectorFromFiltered(Double value, String month);

}

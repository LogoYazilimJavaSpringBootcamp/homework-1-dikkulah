package Service;

import Model.Customer;
import Model.Order;

import java.util.List;

public interface OrderService {
    void save(Order order);

    void findAll();// sistemdeki tüm faturalar

    List<Order> findByJoinDate(int month); // haziran ayında katılanların fatura toplamları

    List<Order> findHigherThen(Double price); // 1500 tl üzeri fatura

    List<Order> findHigherThenAverage(Double price); // 1500 tl üzeri fatura ortalaması

    List<Customer> findLowerThen(Double price); // 500 tl altı fatura sahip isimleri

    List<Customer> findLowerThenSector(Double price); // haziran ayı 750 altı faturaları olan firmaların sektörleri
}

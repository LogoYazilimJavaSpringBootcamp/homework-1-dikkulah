package Service;

import Model.Customer;
import Model.Order;

public interface OrderService {

    void save(Customer customer, Order order); //fatura kaydetme

    void printAll();// sistemdeki tüm faturaları listeleme

    void printOrdersByCustomer(Customer customer); // müşterinin faturalarını listele

    void findSumOrderByJoinDate(String month); // X ayında kayıt olanların fatura toplam tutarı

    void findHigherThenX(Double price); // x tl üzeri fatura

    void findAverageHigherThenX(Double price); // 1500 tl üzeri fatura ortalaması

    void findLowerThenX(Double price); // 500 tl altı fatura sahip isimleri

    //void getAverageOfOrdersFromOneCompany(Customer customer, Double price, String month) ;



}

package Service;

import Model.Customer;
import Model.Order;

import java.util.ArrayList;
import java.util.List;

public class CustomerImp implements CustomerService {


    @Override
    public void save(Customer customer) {

        System.out.println(customer.toStringFullName() + " müşterisi kaydedildi.");
        Customer.getAllCustomers().add(customer);
    }

    @Override
    public void findByContainsLetter(String letter) {
        System.out.println("|----------  " + letter + " Harfini içerenler----|");
        Customer.getAllCustomers().stream()
                .map(Customer::toStringFullName)
                .filter(s -> (s.contains(letter.toLowerCase()) || s.contains(letter.toUpperCase())))
                .forEach(System.out::println);
    }


    @Override
    public void printAll() {
        System.out.println("|-------------------------------Tüm Müşteriler-------------------------------| ");
        System.out.println("|----------------------CUSTOMER ID-----------|------------NAME-SURNAME---₺---|");
        Customer.getAllCustomers().stream().map(Customer::toString).forEach(System.out::println);


    }

    /***
     *
     * @param price average price
     * @param month ingilizce ayın kısaltması
     *
     */
    @Override
    public  void getSectorFromFiltered(Double price, String month) {
        System.out.println("----- "+month+" ayındaki faturalarının ortalamaları "+ price+ "₺ dan küçük olanları sektörleri---");
        for (Customer customer : Customer.getAllCustomers()) {
            try {
                if (customer.getOrders().stream().filter(order -> order.getOrderDate().toString().contains(month))
                        .mapToDouble(Order::getTotalPrice).average().orElseThrow() < price) {
                    System.out.println(customer.getSector());
                }
            } catch (Exception e) {
                System.out.println(customer.toStringFullName() + " müşterisinin hiç faturası yok.");
            }
        }

    }


}



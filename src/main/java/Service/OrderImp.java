package Service;

import Model.Customer;
import Model.Order;
import Model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class OrderImp implements OrderService {


    @Override
    public void save(Customer customer, Order order) {
        customer.getOrders().add(order);
        System.out.println(customer.getName() + " müşterisine fatura kaydedildi: " + customer.getOrders().toString());
        Order.getAllOrders().add(order);
    }

    @Override
    public void printAll() {
        System.out.println("|---------------------Tüm faturalar-----------------------| ");
        System.out.println("|-----------ORDER ID-----------|-------NAME-SURNAME---₺---|");
        Order.getAllOrders().stream()
                .map(order -> (order.getId() + " " + order.getCustomer().getName() + " "
                        + order.getCustomer().getSurName()) + " "
                        + order.getProducts().stream().map(Product::getName).toList() + " "
                        + order.getTotalPrice().toString() + "₺")
                .forEach(System.out::println);

    }

    @Override
    public void printOrdersByCustomer(Customer customer) {
        System.out.println("|-------" + customer.toStringFullName() + " ın faturaları : --------------]");
        // Map kullanmak için silindi
        //customer.getOrders().stream().map(order -> order.getId() + " " + order.getProducts().toString() + " " + order.getTotalPrice() + "₺").forEach(System.out::println);

        Map<String,List<Product>> a= Order.getAllOrders().stream().filter(order -> order.getCustomer() == customer).collect(Collectors.toMap(Order::getId,Order::getProducts));

        a.forEach((key, value) -> System.out.println(key + " " + new ArrayList<>(value) ));
    }


    @Override  // X ayında kayıt olanların fatura toplam tutarı
    public void findSumOrderByJoinDate(String month) {
        List<Order> monthOrders= Order.getAllOrders().stream().filter(order -> order.getCustomer().getJoinDate().toString().contains("Jun")).toList();
        System.out.println("|---"+month + "   ayında kayıt olan müşterilerin fatura toplamı----------|");
        System.out.println(monthOrders.stream().mapToDouble(Order::getTotalPrice).sum());


    }

    @Override
    public void findHigherThenX(Double price) {
        System.out.println("|--------------" + price + "₺ den büyük faturalar----------------| ");
        System.out.println("|-----------ORDER ID-----------|-------NAME-SURNAME---₺---|");
        Order.getAllOrders().stream().filter(order -> order.getTotalPrice() >= price)
                .toList()
                .forEach(order -> System.out.println(order.getId() + " " +
                        order.getCustomer().getName() + " " +
                        order.getCustomer().getSurName() + " " +
                        order.getTotalPrice() + "₺"));
    }

    @Override
    public void findAverageHigherThenX(Double price) {
        System.out.println(price + " ₺ den büyük olan faturaların ortalaması:  "
                + Order.getAllOrders().stream().filter(order -> order.getTotalPrice() >= price)
                .mapToDouble(Order::getTotalPrice).average().orElseThrow() + " ₺");
    }

    @Override
    public void findLowerThenX(Double price) {
        System.out.println("|--------------" + price + "₺ den küçük faturaların sahipleri----------------| ");
        Set<String> setName = new HashSet<>(Order.getAllOrders().stream()
                .filter(order -> order.getTotalPrice() <= price)
                .map(order -> order.getCustomer().toStringFullName())
                .toList());
        setName.forEach(System.out::println);

    }



}

package Service;

import Model.Customer;
import Model.Order;
import Model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class OrderImp implements OrderService {
    private final List<Order> allOrders = new ArrayList<>(CustomerImp.allCustomers.stream().map(customer -> customer.getOrders().get(0)).toList());


    @Override
    public void save(Customer customer, Order order) {
        customer.getOrders().add(order);
        System.out.println(customer.getName() + " müşterisine fatura kaydedildi: " + customer.getOrders().toString());
        allOrders.add(order);
    }

    @Override
    public void printAll() {
        System.out.println("|---------------------Tüm faturalar-----------------------| ");
        System.out.println("|-----------ORDER ID-----------|-------NAME-SURNAME---₺---|");
        allOrders.stream()
                .map(order -> (order.getId() + " " + order.getCustomer().getName() + " "
                        + order.getCustomer().getSurName()) + " "
                        + order.getProducts().stream().map(Product::getName).toList() + " "
                        + order.getTotalPrice().toString() + "₺")
                .forEach(System.out::println);

    }

    @Override
    public void printOrdersByCustomer(Customer customer) {
        System.out.println("|-------" + customer.toStringFullName() + " ın faturaları : --------------]");
        customer.getOrders().stream().map(order -> order.getId() + " " + order.getProducts().toString() + " " + order.getTotalPrice() + "₺").forEach(System.out::println);

    }


    @Override  // X ayında kayıt olanların fatura toplam tutarı
    public void findSumOrderByJoinDate(String month) {
        List<Order> monthOrders= allOrders.stream().filter(order -> order.getCustomer().getJoinDate().toString().contains("Jun")).toList();
        System.out.println("|---"+month + "   ayında kayıt olan müşterilerin fatura toplamı----------|");
        System.out.println(monthOrders.stream().mapToDouble(Order::getTotalPrice).sum());


    }

    @Override
    public void findHigherThenX(Double price) {
        System.out.println("|--------------" + price + "₺ den büyük faturalar----------------| ");
        System.out.println("|-----------ORDER ID-----------|-------NAME-SURNAME---₺---|");
        allOrders.stream().filter(order -> order.getTotalPrice() >= price)
                .toList()
                .forEach(order -> System.out.println(order.getId() + " " +
                        order.getCustomer().getName() + " " +
                        order.getCustomer().getSurName() + " " +
                        order.getTotalPrice() + "₺"));
    }

    @Override
    public void findAverageHigherThenX(Double price) {
        System.out.println(price + " ₺ den büyük olan faturaların ortalaması:  "
                + allOrders.stream().filter(order -> order.getTotalPrice() >= price)
                .mapToDouble(Order::getTotalPrice).average().getAsDouble() + " ₺");
    }

    @Override
    public void findLowerThenX(Double price) {
        System.out.println("|--------------" + price + "₺ den küçük faturaların sahipleri----------------| ");
        Set<String> setName = new HashSet<>(allOrders.stream().filter(order -> order.getTotalPrice() <= price).map(order -> order.getCustomer().toStringFullName())
                .toList());
        setName.forEach(System.out::println);

    }



    @Override
    public void findSectorByLowerThenX(Double price, String month) {
        System.out.println("|-----" + (month) + " ayında -" + price + "₺ den küçük fatura sahiplerinin sektörü-----| ");
        List<Order> monthOrders= allOrders.stream().filter(order -> order.getOrderDate().toString().contains("Jun")).toList();

        Map<Customer,Double> map= new HashMap<Customer, Double>();
       // Set<String> setName = new HashSet<>(monthOrders.stream().map(order ->);

//        var a= monthOrders.stream().mapMulti((order, consumer) -> {
//            for (Order order1: order.getCustomer().getOrders()){
//                order.
//                consumer.accept(new Map<Customer,Double>(order1.getCustomer(),order1.getTotalPrice()));
//            }
//        });


    }
}
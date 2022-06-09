package Service;

import Model.Customer;
import Model.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class OrderImp implements OrderService {
    private List<Order> allOrders = new ArrayList<>(20);

    @Override
    public void save(Order order) {
        allOrders.add(order);
    }

    @Override
    public void findAll() {
        AtomicInteger i = new AtomicInteger(0);

    }

    @Override
    public List<Order> findByJoinDate(int month) {
        return null;
    }

    @Override
    public List<Order> findHigherThen(Double price) {
        return null;
    }

    @Override
    public List<Order> findHigherThenAverage(Double price) {
        return null;
    }

    @Override
    public List<Customer> findLowerThen(Double price) {
        return null;
    }

    @Override
    public List<Customer> findLowerThenSector(Double price) {
        return null;
    }
}

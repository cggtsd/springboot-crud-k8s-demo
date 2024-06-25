package cgg.docker.k8s.springboot_crud_k8s_demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cgg.docker.k8s.springboot_crud_k8s_demo.entity.Order;
import cgg.docker.k8s.springboot_crud_k8s_demo.repository.OrderRepository;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository repository;

    public Order addOrder(Order order) {
        return repository.save(order);
    }

    public List<Order> getOrders() {
        return repository.findAll();
    }

    public Order getOrderById(int id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid id : " + id));
    }
}

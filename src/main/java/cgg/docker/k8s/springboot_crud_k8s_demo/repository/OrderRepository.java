package cgg.docker.k8s.springboot_crud_k8s_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cgg.docker.k8s.springboot_crud_k8s_demo.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}

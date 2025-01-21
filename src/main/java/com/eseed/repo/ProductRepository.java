package com.eseed.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eseed.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
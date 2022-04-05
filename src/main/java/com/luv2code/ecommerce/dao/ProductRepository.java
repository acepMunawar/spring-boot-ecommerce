package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

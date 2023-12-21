package com.ll.mb.domain.product.product.service.ProductService;

import com.ll.mb.domain.product.product.entity.Product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}

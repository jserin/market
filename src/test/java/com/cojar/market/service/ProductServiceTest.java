package com.cojar.market.service;

import com.cojar.market.product.ProductRepository;
import com.cojar.market.product.ProductService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;
    @Test
    @DisplayName("강의 제품 생성")
    void test1 () {
        for (int i = 1; i <= 200; i++) {
          String name = String.format("테스트상품:[%03d]", i);
          int price = 30000;
            this.productService.create(name, price);
        }
    }
}

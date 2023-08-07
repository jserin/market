package com.cojar.market.service;

import com.cojar.market.product.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MarketProductServiceTest {
    @Autowired
    private ProductService productService;
    @Test
    void contextLoads() {
    }
}

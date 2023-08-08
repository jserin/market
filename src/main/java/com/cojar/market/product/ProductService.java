package com.cojar.market.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getList(){
        return this.productRepository.findAll();
    }


    public void create(String name, int price) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        p.setCreateDate(LocalDateTime.now());
        this.productRepository.save(p);
    }
}

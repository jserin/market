package com.cojar.market.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        this.productRepository.save(p);
    }

    public Product getProduct(Long id) {
        Optional<Product> p = this.productRepository.findById(id);
        if (p.isPresent()) {
            return p.get();
        } else {
            return null;
        }
    }
}

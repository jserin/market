package com.cojar.market.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ProductController {
    private final ProductService productService;

    @GetMapping("/products")
    public String list(){
        return "list";
    }
}

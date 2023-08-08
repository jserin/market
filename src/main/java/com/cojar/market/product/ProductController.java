package com.cojar.market.product;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequestMapping("/products")
@RequiredArgsConstructor
@Controller
public class ProductController {
    private final ProductService productService;

    @GetMapping("")
    public String list(Model model){
        List<Product> productList = this.productService.getList();
        model.addAttribute("productList", productList);
        return "product/list";
    }

    @GetMapping("/{id}")
    public String detail(Model model, @RequestParam("id") Long id) {

        return "product/detail";
    }
}

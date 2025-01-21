package com.eseed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eseed.entity.Product;
import com.eseed.service.ProductService1;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/products1")
public class ProductController1 {
	private final ProductService1 productService1;
	
public ProductController1(ProductService1 productService1) {
	this.productService1 = productService1;
}

@GetMapping
public String listProducts(Model model) {
	model.addAttribute("products1",productService1.findAll() );
	return "products1";
	
}
@GetMapping("/new")
public String createProduct(Model model) {
  model.addAttribute("product1" ,new Product());
    return "product-form1";
}

@PostMapping
public String saveProduct(@ModelAttribute Product product) {
	productService1.save(product);
	return "redirect:/products1";
	
}

@GetMapping("/edit/{id}")
public String editById(@PathVariable  Long id ,Model model) {
	model.addAttribute("product1",productService1.findById(id) .orElse(new Product()));
    return "product-form1";
} 

@GetMapping("/delete/{id}")
public String deleteById(@PathVariable Long id ) {
	productService1.deleteById(id);
	return "redirect:/products1";
}
}

package com.products.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.enity.product;
import com.products.service.productServiceImpl;

@RestController
public class productController {
	
	@Autowired
	productServiceImpl productService;
	
	@PostMapping("/createproduct")
	public ResponseEntity createProduct(@RequestBody product p) {
		return productService.createProduct(p);
	}
	
	@GetMapping("/findproduct/{id}")
	public ResponseEntity findProductById(@PathVariable Integer id) {
		return productService.findProductById(id);
	}
	
	@GetMapping("/findallproducts")
	public ResponseEntity getAllProducts() {
		return productService.getAllProducts();
	}
	
	@PostMapping("/updateproduct")
	public ResponseEntity updateProductById(@RequestBody product p) {
		Integer id=p.getId();
		return productService.updateProductById(id, p);
	}
	
	@DeleteMapping("deleteproduct/{id}")
	public ResponseEntity deleteProductById(@PathVariable Integer id) {
		return productService.deleteProductById(id);
	}

}

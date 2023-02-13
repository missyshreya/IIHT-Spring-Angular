package com.products.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.products.entity.Product;

public interface IProductService {
	
	public ResponseEntity createProduct(Product p);

	public ResponseEntity findProductById(Integer id);
	
	public ResponseEntity<List<Product>> getAllProducts();
	
	public ResponseEntity updateProductById(Integer id, Product p);
	
	public ResponseEntity deleteProductById(Integer id);
}

package com.products.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.products.enity.product;

public interface IProductService {
	
	public ResponseEntity createProduct(product p);

	public ResponseEntity findProductById(Integer id);
	
	public ResponseEntity<List<product>> getAllProducts();
	
	public ResponseEntity updateProductById(Integer id, product p);
	
	public ResponseEntity deleteProductById(Integer id);
}

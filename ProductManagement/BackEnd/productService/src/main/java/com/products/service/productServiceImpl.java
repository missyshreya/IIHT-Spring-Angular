
package com.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.products.entity.Product;
import com.products.repository.IProductRepo;

@Service
public class productServiceImpl implements IProductService{

	@Autowired
	private IProductRepo prodRepo;
	
	@Override
	public ResponseEntity createProduct(Product p) {
		return ResponseEntity.ok(prodRepo.save(p));
	}

	@Override
	public ResponseEntity findProductById(Integer id) {		
		return ResponseEntity.ok(prodRepo.findById(id));
	}

	@Override
	public ResponseEntity<List<Product>> getAllProducts() {		
		return ResponseEntity.ok(prodRepo.findAll());		
	}

	@Override
	public ResponseEntity updateProductById(Integer id, Product p) {	
		Optional<Product> exists= prodRepo.findById(id);
		exists.get().setName(p.getName());
		exists.get().setPrice(p.getPrice());
		exists.get().setDetails(p.getDetails());
		return ResponseEntity.ok(prodRepo.save(exists.get()));
	}

	@Override
	public ResponseEntity deleteProductById(Integer id) {
		Optional<Product> exists= prodRepo.findById(id);
		prodRepo.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}

}

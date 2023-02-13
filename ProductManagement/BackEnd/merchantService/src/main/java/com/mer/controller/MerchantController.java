package com.mer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mer.entity.Merchant;
import com.mer.service.MerchantServiceImpl;

@RestController
public class MerchantController {

	@Autowired
	private MerchantServiceImpl merchantService;
	
	@PostMapping("/createmerchant")
	public ResponseEntity createMerchant(@RequestBody Merchant m) {
		return merchantService.createMerchant(m);
	}
	
	@PostMapping("/updatemerchant")
	public ResponseEntity updateMerchant(@RequestBody Merchant m) {
		Integer id=m.getId();
		return merchantService.updateMerchant(id, m);
	}
	
	@GetMapping("/allmerchants")
	public ResponseEntity<List<Merchant>> allMerchants() {
		return merchantService.allMerchants();
	}
}

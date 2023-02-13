package com.mer.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mer.entity.Merchant;
import com.mer.entity.Roles;

public interface IMerchantService {

	public ResponseEntity createMerchant(Merchant m);
	
	public ResponseEntity updateMerchant(Integer id, Merchant m);
	
	public ResponseEntity createRole(Roles r);
	
	public ResponseEntity<List<Merchant>> allMerchants();
	
}

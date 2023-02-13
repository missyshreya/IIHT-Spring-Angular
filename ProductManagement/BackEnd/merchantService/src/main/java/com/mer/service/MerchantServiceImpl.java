package com.mer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mer.entity.Merchant;
import com.mer.entity.Roles;
import com.mer.repository.IMerchantRepo;
import com.mer.repository.IRolesRepo;

public class MerchantServiceImpl implements IMerchantService{

	@Autowired
	private IMerchantRepo merchantRepo;
	
	@Autowired
	private IRolesRepo rolesRepo;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public ResponseEntity createMerchant(Merchant m) {
		return ResponseEntity.ok(merchantRepo.save(m));
	}

	@Override
	public ResponseEntity updateMerchant(Integer id, Merchant m) {
		Optional<Merchant> exists= merchantRepo.findById(id);
		exists.get().setName(m.getName());
		exists.get().setPassword(passwordEncoder.encode(m.getPassword()));
		exists.get().setRole(m.getRole());
		return ResponseEntity.ok(merchantRepo.save(exists.get()));
	}

	@Override
	public ResponseEntity createRole(Roles r) {		
		return ResponseEntity.ok(rolesRepo.save(r));
	}

	@Override
	public ResponseEntity<List<Merchant>> allMerchants() {		
		return ResponseEntity.ok(merchantRepo.findAll());
	}


}

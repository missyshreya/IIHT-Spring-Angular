package com.mer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mer.entity.Merchant;

public interface IMerchantRepo extends JpaRepository<Merchant, Integer> {

}

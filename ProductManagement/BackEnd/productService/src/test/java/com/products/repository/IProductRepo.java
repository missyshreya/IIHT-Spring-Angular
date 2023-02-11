package com.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.products.enity.product;

@Repository
public interface IProductRepo extends JpaRepository<product, Integer>{

}

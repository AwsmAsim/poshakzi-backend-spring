package com.poshakzi.poshakzibackend.repository;

import org.springframework.data.repository.CrudRepository;

import com.poshakzi.poshakzibackend.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}

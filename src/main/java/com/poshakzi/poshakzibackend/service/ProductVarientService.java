package com.poshakzi.poshakzibackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.poshakzi.poshakzibackend.dto.ProductVarientDTO;
import com.poshakzi.poshakzibackend.entity.ProductVarient;
import com.poshakzi.poshakzibackend.repository.ProductVarientRepository;

public class ProductVarientService {
	
	
	@Autowired
	ProductVarientRepository productVarientRepository;
	
	public List<ProductVarientDTO> getAllProducts(){
		
		List<ProductVarient> productVarients = new ArrayList<>();
		productVarientRepository.findAll().forEach(value -> productVarients.add(value));
		
		List<ProductVarientDTO> productVarientDTOs = new ArrayList<>();
		productVarients.forEach(
				product->{
					productVarientDTOs.add(product.toDTO());
				}
		);
		
		return productVarientDTOs;
		
	}
	
	
	
	
}

package com.poshakzi.poshakzibackend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poshakzi.poshakzibackend.dto.ProductDTO;
import com.poshakzi.poshakzibackend.entity.Product;
import com.poshakzi.poshakzibackend.exception.NoDataFoundException;
import com.poshakzi.poshakzibackend.exception.UnknownInternalException;
import com.poshakzi.poshakzibackend.repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	ProductRepository productRepository;
	
	public List<ProductDTO> getAllProducts() throws NoDataFoundException, UnknownInternalException{
		
		
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(product->products.add(product));
		
		List<ProductDTO> productDTOs = new ArrayList<>();
		products.forEach(product->{
			productDTOs.add(product.toDTO());
		});
		
		
		
		return productDTOs;
	}
	
}

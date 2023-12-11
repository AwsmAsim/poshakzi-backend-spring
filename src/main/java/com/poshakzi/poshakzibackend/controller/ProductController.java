package com.poshakzi.poshakzibackend.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poshakzi.poshakzibackend.dto.ProductDTO;
import com.poshakzi.poshakzibackend.exception.NoDataFoundException;
import com.poshakzi.poshakzibackend.exception.UnknownInternalException;
import com.poshakzi.poshakzibackend.exception_handling.ErrorInfo;
import com.poshakzi.poshakzibackend.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping(value="/all")
	public ResponseEntity<List<ProductDTO>> getAllProducts() throws NoDataFoundException, UnknownInternalException{
	
			List<ProductDTO> productDTOs = productService.getAllProducts();
			return new ResponseEntity<>(productDTOs, HttpStatus.ACCEPTED);
		
		
		
	}
	
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<ErrorInfo> noDataHandler(NoDataFoundException exception){
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.NO_CONTENT);
		errorInfo.setErrorMessage(exception.getMessage());
		errorInfo.setTimeStamp(LocalDate.now());
		
		return new ResponseEntity<>(errorInfo, HttpStatus.NO_CONTENT);
		
	}
	
	
	@ExceptionHandler(UnknownInternalException.class)
	public ResponseEntity<ErrorInfo> unknownInternalExceptionHandler(UnknownInternalException exception){
		
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR);
		errorInfo.setErrorMessage(exception.getMessage());
		errorInfo.setTimeStamp(LocalDate.now());
		
		return new ResponseEntity<>(errorInfo, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}

package com.poshakzi.poshakzibackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.poshakzi.poshakzibackend.dto.PincodeResponseDTO;
import com.poshakzi.poshakzibackend.dto.PostOfficeDTO;
import com.poshakzi.poshakzibackend.exception.NoDataFoundException;
import com.poshakzi.poshakzibackend.exception_handling.ErrorInfo;
import com.poshakzi.poshakzibackend.service.PostOfficeService;

@RestController
@RequestMapping("/postoffice")
public class PostOfficeController {

	RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	PostOfficeService postOfficeService;
	
	@GetMapping("/{pincode}")
	public PostOfficeDTO getPostOfficeDetails(@PathVariable String pincode) throws NoDataFoundException {
		
	     ResponseEntity<List<PincodeResponseDTO>> responseEntity = restTemplate.exchange("https://api.postalpincode.in/pincode/" + pincode,
                 HttpMethod.GET, null, new ParameterizedTypeReference<List<PincodeResponseDTO>>() {
                 });

	     List<PincodeResponseDTO> pincodeResponses = responseEntity.getBody();
 
		System.out.println(pincodeResponses);
		
		if(pincodeResponses.size() == 0) throw new NoDataFoundException("No list returned");
		
		return postOfficeService.getDetailsFromResponse(pincodeResponses);
		
	}
	
	
	@ExceptionHandler(NoDataFoundException.class)
	public ResponseEntity<ErrorInfo> noDataResponse(NoDataFoundException exception) {
		ErrorInfo errorInfo = new ErrorInfo();
		
		errorInfo.setErrorCode(HttpStatus.NO_CONTENT);
		
		errorInfo.setErrorMessage(exception.getMessage());
		
		return new ResponseEntity<ErrorInfo>(errorInfo ,HttpStatus.NO_CONTENT);
	}
	
	
}

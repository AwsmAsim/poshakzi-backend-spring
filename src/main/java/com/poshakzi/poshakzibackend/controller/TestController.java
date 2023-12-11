package com.poshakzi.poshakzibackend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poshakzi.poshakzibackend.dto.SingleMessageResponse;

@CrossOrigin
@RestController
@RequestMapping(value = "")
public class TestController {

	
	@GetMapping("/test")
	public ResponseEntity<SingleMessageResponse> test(){
		SingleMessageResponse singleMessageResponse = new SingleMessageResponse();
		singleMessageResponse.setMessage("Working !!!");
		return new ResponseEntity<>(singleMessageResponse, HttpStatus.ACCEPTED);
	}
}

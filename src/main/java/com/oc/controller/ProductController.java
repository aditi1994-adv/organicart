package com.oc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oc.model.Product;
import com.oc.service.ProductService;
import com.oc.util.ConstantMessages;
import com.oc.util.ResponseErrorMessage;
import com.oc.util.ResponseMessage;

@RestController
public class ProductController {

	@Autowired
	private ProductService ps;

	
	
	@PostMapping("/addProduct")
	public ResponseEntity<?> addProduct(@RequestBody Product prdct) {
		Product productSave= new Product();
		try {
			productSave = ps.addProduct(prdct);
			if(productSave!=null) {
				return new ResponseEntity<ResponseMessage>(new ResponseMessage(ConstantMessages.SUCCESSMESSAGE, HttpStatus.OK,productSave),HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<ResponseErrorMessage>(new ResponseErrorMessage(ConstantMessages.ERRORMESSAGE, HttpStatus.BAD_REQUEST),HttpStatus.BAD_REQUEST);

	}

	
	@PostMapping("/listProduct")
	public ResponseEntity<?> listProduct(@RequestParam Long cateId) {
		List<Product> productSave= new ArrayList<>();
		try {
			productSave = ps.listProduct(cateId);
			if(productSave!=null) {
				return new ResponseEntity<ResponseMessage>(new ResponseMessage(ConstantMessages.SUCCESSMESSAGE, HttpStatus.OK,productSave),HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<ResponseErrorMessage>(new ResponseErrorMessage(ConstantMessages.ERRORMESSAGE, HttpStatus.BAD_REQUEST),HttpStatus.BAD_REQUEST);

	}
	
	@PostMapping("/listProduct")
	public ResponseEntity<?> listProduct(@RequestParam Long cateId) {
		List<Product> productSave= new ArrayList<>();
		try {
			productSave = ps.listProduct(cateId);
			if(productSave!=null) {
				return new ResponseEntity<ResponseMessage>(new ResponseMessage(ConstantMessages.SUCCESSMESSAGE, HttpStatus.OK,productSave),HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<ResponseErrorMessage>(new ResponseErrorMessage(ConstantMessages.ERRORMESSAGE, HttpStatus.BAD_REQUEST),HttpStatus.BAD_REQUEST);

	}




}

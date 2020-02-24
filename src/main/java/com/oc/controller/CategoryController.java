package com.oc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oc.model.Category;
import com.oc.model.Product;
import com.oc.service.CategoryService;
import com.oc.util.ConstantMessages;
import com.oc.util.ResponseErrorMessage;
import com.oc.util.ResponseMessage;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService cs;

	@PostMapping("/addCategory")
	public ResponseEntity<?> addCat(@RequestBody Category cat) {
		Category cat2 = new Category();
		try {
			cat2 = cs.addCat(cat);
			if(cat2!=null) {
			return new ResponseEntity<ResponseMessage>(new ResponseMessage(ConstantMessages.SUCCESSMESSAGE, HttpStatus.OK,cat2),HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<ResponseErrorMessage>(new ResponseErrorMessage(ConstantMessages.ERRORMESSAGE, HttpStatus.BAD_REQUEST),HttpStatus.BAD_REQUEST);


	}
	
	@GetMapping("/getAllCategory")
	public ResponseEntity<?> listProduct() {
		List<Category> listProduct= new ArrayList<>();
		try {
			listProduct = cs.listCategory();
			if(listProduct!=null) {
				return new ResponseEntity<ResponseMessage>(new ResponseMessage(ConstantMessages.SUCCESSMESSAGE, HttpStatus.OK,listProduct),HttpStatus.OK);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<ResponseErrorMessage>(new ResponseErrorMessage(ConstantMessages.ERRORMESSAGE, HttpStatus.BAD_REQUEST),HttpStatus.BAD_REQUEST);

	}

}

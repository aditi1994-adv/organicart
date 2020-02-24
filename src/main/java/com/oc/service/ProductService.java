package com.oc.service;

import java.util.List;

import com.oc.model.Product;

public interface ProductService {

	Product addProduct(Product prdct);

	List<Product> listProduct(Long cateId);

	
	

}

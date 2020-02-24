package com.oc.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oc.model.Product;
import com.oc.repo.ProductRepo;
import com.oc.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired 
	private ProductRepo productRepo;
	@Override
	public Product addProduct(Product prdct) {
		Product product = new Product();
		try {
			prdct.setDate(new Date());
			
			product=	productRepo.save(prdct);
		} catch (Exception e) {
			e.printStackTrace();
			product=null;
		}
		return product;
	}
	@Override
	public List<Product> listProduct(Long cateId) {
		 List<Product> prdct = new ArrayList<>();
		 Integer status =0;
		try {
			prdct=productRepo.findByCateCategoryIdAndCateStatus(cateId,status);
			
		} catch (Exception e) {
			e.printStackTrace();
			prdct=null;
		}
		return prdct;
	}
	
	

}

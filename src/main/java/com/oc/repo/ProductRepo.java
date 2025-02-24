package com.oc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oc.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

	List<Product> findByCateCategoryIdAndCateStatus(Long cateId, Integer status);

	List<Product> findByCateCategoryId(Long cateId);

	
	

}

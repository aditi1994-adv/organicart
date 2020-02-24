package com.oc.serviceimpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oc.model.Category;
import com.oc.repo.CategoryRepo;
import com.oc.service.CategoryService;

@Service
public class CategoryServiceImpl  implements CategoryService{
	
	@Autowired
	private CategoryRepo cateRepo;

	@Override
	public Category addCat(Category cat) {
		Category cateSave = new Category();
		try {
			cat.setCreatedDate(new Date());
			cateSave=cateRepo.save(cat);
		} catch (Exception e) {
			e.printStackTrace();
			cat=null;
		}
		return cateSave;
	}

	@Override
	public List<Category> listCategory() {
		List<Category>  listCate = new ArrayList<Category>();
		
		try {
			listCate =cateRepo.findAll();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return listCate;
	}

}

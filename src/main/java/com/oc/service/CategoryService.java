package com.oc.service;

import java.util.List;

import com.oc.model.Category;

public interface CategoryService {

	Category addCat(Category cat);

	List<Category> listCategory();

}

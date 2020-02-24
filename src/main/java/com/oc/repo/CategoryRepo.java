package com.oc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oc.model.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {

}

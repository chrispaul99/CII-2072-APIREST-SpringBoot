package com.guanopatin.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.guanopatin.backend.models.entities.Category;

public interface ICategory extends CrudRepository<Category, Long>{
	

}

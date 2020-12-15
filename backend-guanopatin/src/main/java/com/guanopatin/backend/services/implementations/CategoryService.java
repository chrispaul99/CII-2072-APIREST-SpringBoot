package com.guanopatin.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guanopatin.backend.models.dao.ICategory;
import com.guanopatin.backend.models.entities.Category;
import com.guanopatin.backend.services.interfaces.ICategoryService;

@Service
public class CategoryService implements ICategoryService{
	
	//Inyeccion de dependecias es colocar un componente dentro de otro
	@Autowired
	private ICategory dao;

	@Override
	public void save(Category c) {
		dao.save(c);
		
	}

	@Override
	public Category findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Category c = this.findById(id);
		dao.delete(c);
		
	}

	@Override
	public List<Category> findAll() {
		return (List<Category>) dao.findAll();
	}

}

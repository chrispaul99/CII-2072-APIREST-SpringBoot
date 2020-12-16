package com.guanopatin.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.guanopatin.backend.models.entities.Category;
import com.guanopatin.backend.models.entities.Student;

public interface IStudent extends CrudRepository<Student, Long>{

}

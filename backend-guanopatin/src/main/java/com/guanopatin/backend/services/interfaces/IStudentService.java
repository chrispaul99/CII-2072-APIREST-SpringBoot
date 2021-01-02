package com.guanopatin.backend.services.interfaces;

import java.util.List;

import com.guanopatin.backend.models.entities.Student;

public interface IStudentService {
	public void save(Student s); //create -update
	public Student findById(Long id); //retrieve
	public void delete(Long id); //delete
	public List<Student> findAll(); //list

	/*** Custom method ***/
	public List<Student> findBySex(String gender);
	public Student findByLastName(String lastname);
	public Student findByPlaceOfBirth(String place);
}

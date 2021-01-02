package com.guanopatin.backend.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.guanopatin.backend.models.entities.Student;

public interface IStudent extends CrudRepository<Student, Long>{
	public Student findByLastName(String lastname);
	public Student findByPlaceOfBirth(String place);

	@Query("SELECT st FROM Student st WHERE st.sex =:gender ORDER BY st.lastName")
	public List<Student> findBySex(String gender);

}

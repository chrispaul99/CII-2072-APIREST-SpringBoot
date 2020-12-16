package com.guanopatin.backend.services.implementations;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guanopatin.backend.models.dao.IStudent;
import com.guanopatin.backend.models.entities.Student;
import com.guanopatin.backend.services.interfaces.IStudentService;

@Service
public class StudentService implements IStudentService {

	@Autowired
	private IStudent dao; //Data Access Object
	
	@Override
	@Transactional
	public void save(Student student) {
		try {
			dao.save(student);
		}
		catch(Exception ex) {
			throw ex;
		}
	}

	@Override
	@Transactional(readOnly=true)
	public Student findById(Long id) {		
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Student> findAll() {		
		return (List<Student>) dao.findAll();
	}

}

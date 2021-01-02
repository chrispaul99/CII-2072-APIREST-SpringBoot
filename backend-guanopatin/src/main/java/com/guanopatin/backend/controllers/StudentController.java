package com.guanopatin.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import com.guanopatin.backend.models.entities.Student;
import com.guanopatin.backend.services.interfaces.IStudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private IStudentService service;
	
	@GetMapping("/{id}")
	public Student retrieve(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Student> list() {
		return service.findAll();
	}
	
	@GetMapping("/search/sex/{sex}")
	public List<Student> listBySex(@PathVariable String sex) {
		return service.findBySex(sex);
	}
	@GetMapping("/search/lastname/{lastname}")
	public ResponseUtil listByLastName(@PathVariable String lastname) {
		Student st = service.findByLastName(lastname);
		if(st==null) {
			return new ResponseUtil("Student not found",HttpStatus.NOT_FOUND,null);
		}
		return new ResponseUtil("Student not found",HttpStatus.OK,st);
	}
	
	@GetMapping("/search/place/{place}")
	public ResponseUtil listByPlaceofBirth(@PathVariable String place) {
		Student st = service.findByPlaceOfBirth(place);
		if(st==null) {
			return new ResponseUtil("Student not found",HttpStatus.NOT_FOUND,null);
		}
		return new ResponseUtil("Student not found",HttpStatus.OK,st);
	}
	
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Student create(@RequestBody Student student) {		
		service.save(student);
		return student;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Student update(@RequestBody Student student, @PathVariable Long id) {		 			
		service.save(student);
		return student;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}	
	
	
	

}
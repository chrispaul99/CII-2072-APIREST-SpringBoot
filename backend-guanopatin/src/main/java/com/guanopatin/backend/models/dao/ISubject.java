package com.guanopatin.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.guanopatin.backend.models.entities.Subject;

public interface ISubject extends CrudRepository<Subject, Long> {

}

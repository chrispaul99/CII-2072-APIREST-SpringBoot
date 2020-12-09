package com.guanopatin.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name="Subjects")
@Entity
public class Subject implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_subject")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idSubject;
	
	@Column(name="name")
	private Long name;
	
	@Column(name="hours")
	private int hours;

	@JoinColumn(name="fk_category",referencedColumnName="id_category")
	@ManyToOne
	private Category category;
	
	public Subject() {
		super();
	}

	public Subject(Long idSubject) {
		super();
		this.idSubject = idSubject;
	}

	public Long getIdSubject() {
		return idSubject;
	}

	public void setIdSubject(Long idSubject) {
		this.idSubject = idSubject;
	}

	public Long getName() {
		return name;
	}

	public void setName(Long name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	
}

package com.guanopatin.backend.services.interfaces;

import java.util.List;

import com.guanopatin.backend.models.entities.Club;

public interface IClubService {
	
	public Club findById(Long id);
	public List<Club> findAll();	

}
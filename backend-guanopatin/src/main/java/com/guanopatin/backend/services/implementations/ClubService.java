package com.guanopatin.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guanopatin.backend.models.dao.IClub;
import com.guanopatin.backend.models.entities.Club;
import com.guanopatin.backend.services.interfaces.IClubService;

@Service
public class ClubService implements IClubService {

	@Autowired
	private IClub dao; //Data Access Object
	
	@Override
	@Transactional(readOnly=true)
	public Club findById(Long id) {		
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Club> findAll() {		
		return (List<Club>) dao.findAll();
	}

}

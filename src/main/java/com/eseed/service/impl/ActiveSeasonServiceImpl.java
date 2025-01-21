package com.eseed.service.impl;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eseed.entity.ActiveSeason;
import com.eseed.projection.ActiveSeasonProjection;
import com.eseed.repo.ActiveSeasonRepository;
import com.eseed.service.ActiveSeasonService;

@Service
public class ActiveSeasonServiceImpl implements ActiveSeasonService{

	@Autowired
	private ActiveSeasonRepository repo;
	
	@Autowired
	ActiveSeasonRepository activeseasonRepository;
	

	public List<ActiveSeason> listAll() {

		return repo.findByActiveAndCurrentSeason();
	}

	@Override
	public List<ActiveSeasonProjection> getActiveSeason() {
		// TODO Auto-generated method stub
		return repo.getActiveSeason();
	}

	//@Override
//	public List<ActiveSeasonProjection> findByActiveAndCurrentSeason() {
//		// TODO Auto-generated method stub
//		return repo.findByActiveAndCurrentSeason2();
//	}

//	public List<Activeseason2> findAll(){
//		return activeseasonRepository.getActiveseason();
//	}

}

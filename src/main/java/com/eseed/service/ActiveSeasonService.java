package com.eseed.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.eseed.entity.ActiveSeason;
import com.eseed.projection.ActiveSeasonProjection;

@Service
public interface ActiveSeasonService {

	public List<ActiveSeason> listAll();
	
	public List<ActiveSeasonProjection> getActiveSeason();
	
//	public List<ActiveSeasonProjection> findByActiveAndCurrentSeason();
//	public List<Activeseason> findAll();
}

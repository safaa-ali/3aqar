package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.dao.LandRepo;
import com.example.demo.models.Land;
@Service
public class LandService {
	
	@Autowired
	private LandRepo landRepo ;
		public List<Land> getAllLands() {
			return landRepo.findAll();
		}
	 
		public void addNewland(Land land) {
			 landRepo.save(land);
		}
}

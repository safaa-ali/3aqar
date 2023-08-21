package com.example.demo.controller;




import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.LandRepo;
import com.example.demo.models.Land;
import com.example.demo.services.LandService;
import com.example.demo.services.SequenceGeneratorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1")
public class LandController {
	
//    Logger logger = LoggerFactory.getLogger(LoggingController.class);
	
	@Autowired
	private LandService landService ;
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	 @PostMapping("/addNewLand")
	    public String createEmployee(@Valid @RequestBody Land land) {
		 land.setId(sequenceGeneratorService.generateSequence(land.SEQUENCE_NAME));
	         landService.addNewland(land);
			 return "New Land addedd successfully !";

	    }
	 
	 
	 @GetMapping("/getAllLads")
		public List<Land> getAllEmployees() {
			return landService.getAllLands();
		}
}

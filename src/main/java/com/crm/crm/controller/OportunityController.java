package com.crm.crm.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.crm.model.Oportunity;
import com.crm.crm.service.OportunityService;

@CrossOrigin(origins = "http://localhost:8899")
@RestController
@RequestMapping("/app")
public class OportunityController {
	
@Autowired
OportunityService oportunityService;
	
	@PostMapping("/oportunities/add")
	public Oportunity addOportunity(@RequestBody Oportunity oportunity) {
		return oportunityService.addOportunity(oportunity);	
	}
	
	@GetMapping("/oportunities")
	public List<Oportunity> showAllOportunities(){
		return oportunityService.findAllOportunities();
		
	}
	

	
}



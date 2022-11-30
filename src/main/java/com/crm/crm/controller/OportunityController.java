//package com.crm.crm.controller;
//
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.crm.crm.model.Oportunity;
//import com.crm.crm.repository.OportunityRegisterRepository;
//
//@CrossOrigin(origins = "http://localhost:8899")
//@RestController
//@RequestMapping("/app")
//public class OportunityController {
//	
//
//
//	@GetMapping("/oportunities/add")
//	public Oportunity addOportunity() {
//		return null;	
//	}
//	
//	public ResponseEntity<List<Oportunity>> getAllOportunities(@RequestParam(required = false) String name, String surname) {
//		try {
//			List<Oportunity> oportunityRegister = new ArrayList<Oportunity>();
//
//			if (name == null && surname ==null)
//				oportunityRegisterRepository.findAll().forEach(oportunityRegister::add);
//			else
//				oportunityRegisterRepository.findByNameSurnameContaining(name).forEach(oportunityRegister::add);
//
//			if (oportunityRegister.isEmpty()) {
//				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//			}
//
//			return new ResponseEntity<>(oportunityRegister, HttpStatus.OK);
//		} catch (Exception e) {
//			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//	
//}

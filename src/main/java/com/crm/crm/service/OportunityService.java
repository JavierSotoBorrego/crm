package com.crm.crm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.crm.model.Oportunity;
import com.crm.crm.repository.OportunityRegisterRepository;

@Service
public class OportunityService {

	@Autowired
	OportunityRegisterRepository oportunityRegisterRepository;

	public Oportunity addOportunity(Oportunity oportunity) {
		
			return oportunityRegisterRepository.save(oportunity);
	

	}	
	
	public List<Oportunity> findAllOportunities(){
		return oportunityRegisterRepository.findAll();
		
	}
	
	public List<Oportunity> findOportunitiesByName(String oportunityName){	
		return oportunityRegisterRepository.findByName(oportunityName);
	}
	
	public List<Oportunity> findOportunitiesBySurName(Oportunity oportunity){
		return null;
	}
	
	public List<Oportunity> findOportunitiesByDClient(Oportunity oportunity){
		return null;
	}
	
	public List<Oportunity> findOportunitiesByTypeContact(Oportunity oportunity){
		return null;
	}
	
	public List<Oportunity> findOportunitiesByDate(Oportunity oportunity){
		return null;
	}
	
	public Oportunity updateOportunityClient(Oportunity oportunity,Boolean bClient) {
		Oportunity oportunityToUpdate=(Oportunity) oportunityRegisterRepository.findByName(oportunity.getName());
		oportunityToUpdate.setbClient(bClient);
		return oportunityRegisterRepository.save(oportunityToUpdate);
		
	}
	
}

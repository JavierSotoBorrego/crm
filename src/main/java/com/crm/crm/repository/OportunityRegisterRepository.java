package com.crm.crm.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.bezkoder.spring.jpa.h2.model.Tutorial;
import com.crm.crm.model.Oportunity;


public interface OportunityRegisterRepository extends JpaRepository<Oportunity,Long>{
//	  List<Oportunity> findByClient(boolean client);
	  List<Oportunity> findByName(String name);
//	  List<Oportunity> findByTypeContact(String typeTontact);
//	  List<Oportunity> findByDate(Date date);

	
}


package com.crm.crm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.bezkoder.spring.jpa.h2.model.Tutorial;
import com.crm.crm.model.Oportunity;

public interface OportunityRegisterRepository extends JpaRepository<Oportunity, Long> {
	List<Oportunity> findByName(String name);

	Oportunity findTop1ByName(String name);
//	  List<Oportunity> findByTypeContact(String typeTontact);
//	  List<Oportunity> findByDate(String date);

	List<Oportunity> findByClientBoolean(Boolean bclient);

}

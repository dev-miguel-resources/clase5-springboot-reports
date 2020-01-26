package com.pixelab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pixelab.model.Medico;

//@Repository
public interface IMedicoRepo extends JpaRepository<Medico, Integer>{
	
}

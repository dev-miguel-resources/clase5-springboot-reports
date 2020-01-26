package com.pixelab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pixelab.model.Examen;

//@Repository
public interface IExamenRepo extends JpaRepository<Examen, Integer>{
	
}

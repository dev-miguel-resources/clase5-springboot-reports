package com.pixelab.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pixelab.model.Paciente;

//@Repository
public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{
	
}

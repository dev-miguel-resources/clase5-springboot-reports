package com.pixelab.service;

import java.util.List;

import com.pixelab.model.ConsultaExamen;

public interface IConsultaExamenService {

	List<ConsultaExamen> listarExamenesPorConsulta(Integer idconsulta);
}

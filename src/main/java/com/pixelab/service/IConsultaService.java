package com.pixelab.service;

import java.util.List;

import com.pixelab.dto.ConsultaListaExamenDTO;
import com.pixelab.dto.ConsultaResumenDTO;
import com.pixelab.dto.FiltroConsultaDTO;
import com.pixelab.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta>{

	Consulta registrarTransaccional(ConsultaListaExamenDTO dto);
	
	List<Consulta> buscar(FiltroConsultaDTO filtro);

	List<Consulta> buscarFecha(FiltroConsultaDTO filtro);
	
	List<ConsultaResumenDTO> listarResumen();
	
	byte[] generarReporte();
		
}

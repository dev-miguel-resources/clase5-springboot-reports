package com.pixelab.service.impl;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pixelab.dto.ConsultaListaExamenDTO;
import com.pixelab.dto.ConsultaResumenDTO;
import com.pixelab.dto.FiltroConsultaDTO;
import com.pixelab.model.Consulta;
import com.pixelab.repo.IConsultaExamenRepo;
import com.pixelab.repo.IConsultaRepo;
import com.pixelab.service.IConsultaService;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class ConsultaServiceImpl implements IConsultaService{

}

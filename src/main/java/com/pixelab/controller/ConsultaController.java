package com.pixelab.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pixelab.dto.ConsultaDTO;
import com.pixelab.dto.ConsultaListaExamenDTO;
import com.pixelab.dto.ConsultaResumenDTO;
import com.pixelab.dto.FiltroConsultaDTO;
import com.pixelab.exception.ModeloNotFoundException;
import com.pixelab.model.Consulta;
import com.pixelab.service.IConsultaService;


@RestController
@RequestMapping("/consultas")
public class ConsultaController {
		
}

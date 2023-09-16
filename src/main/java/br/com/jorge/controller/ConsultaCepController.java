package br.com.jorge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jorge.model.ConsultaCepDTO;
import br.com.jorge.service.ConsultaCepService;

@RestController
@RequestMapping("/consulta-cep")
public class ConsultaCepController {

	@Autowired
	private ConsultaCepService service;
	
	@GetMapping("/{cep}")
	public ResponseEntity<ConsultaCepDTO> consultaCep(@PathVariable(name = "cep") String cep) {
		return service.consultaCep(cep);
	}
}

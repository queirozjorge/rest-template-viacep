package br.com.jorge.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.jorge.model.ConsultaCepDTO;

@Service
public class ConsultaCepService {

	private final String url = "https://viacep.com.br/ws/%s/json";
	
	public ResponseEntity<ConsultaCepDTO> consultaCep(String cep) {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForEntity(String.format(url, cep), ConsultaCepDTO.class);
	}
	
}

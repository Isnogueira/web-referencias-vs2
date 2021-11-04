package br.com.mirante.webservicereferencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mirante.webservicereferencia.domain.ReferenciasProduto;
import br.com.mirante.webservicereferencia.repository.ReferenciaRepository;

@RestController
public class ReferenciasController {

	@Autowired
	private ReferenciaRepository referenciasRepository;
	
	@GetMapping("/referencias")
	public List<ReferenciasProduto> listarReferencias(){
		
		return referenciasRepository.listar();
	}
	
	
	
}

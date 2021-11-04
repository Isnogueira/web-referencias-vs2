package br.com.mirante.webservicereferencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mirante.webservicereferencia.domain.ReferenciasProduto;
import br.com.mirante.webservicereferencia.repository.ReferenciaRepository;

@Service
public class ListarReferenciasService {

	@Autowired
	private ReferenciaRepository referenciaRepository;
	
	
	public List<ReferenciasProduto> listarReferencias(){
		
		return referenciaRepository.listar();
	}
	
}

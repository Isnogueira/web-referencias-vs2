package br.com.mirante.webservicereferencia.repository;

import java.util.List;

import br.com.mirante.webservicereferencia.domain.ReferenciasProduto;

public interface ReferenciaRepository {

	void salvar(List<ReferenciasProduto> referencias);
	
	List<ReferenciasProduto> listar();

}

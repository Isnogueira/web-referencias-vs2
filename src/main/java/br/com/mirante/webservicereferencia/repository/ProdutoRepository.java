package br.com.mirante.webservicereferencia.repository;

import java.util.List;

import br.com.mirante.webservicereferencia.domain.Produto;

public interface ProdutoRepository {

	void salvar(Produto produto);
	
	List<Produto> listar();
	
	Produto recuperar(String codigo);

	
}

package br.com.mirante.webservicereferencia.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mirante.webservicereferencia.domain.Produto;
import br.com.mirante.webservicereferencia.repository.ProdutoRepository;

@Service
public class ListarProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public List<Produto> listarProdutos(){
	
		
		return produtoRepository.listar();
	}
	
}

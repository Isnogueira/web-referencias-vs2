package br.com.mirante.webservicereferencia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mirante.webservicereferencia.domain.Produto;
import br.com.mirante.webservicereferencia.domain.ReferenciasProduto;
import br.com.mirante.webservicereferencia.repository.ProdutoRepository;
import br.com.mirante.webservicereferencia.repository.ReferenciaRepository;

@Service
public class ListarProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ReferenciaRepository referenciaRepository;
	
	
	public List<Produto> listarProdutos(){
		
		return produtoRepository.listar();
	
	}
	
}

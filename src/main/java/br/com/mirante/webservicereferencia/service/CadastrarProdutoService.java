package br.com.mirante.webservicereferencia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mirante.webservicereferencia.domain.Produto;
import br.com.mirante.webservicereferencia.domain.ReferenciasProduto;
import br.com.mirante.webservicereferencia.repository.ProdutoRepository;
import br.com.mirante.webservicereferencia.repository.ReferenciaRepository;

@Service
public class CadastrarProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private ReferenciaRepository referenciaRepository;
	
	@Transactional
	public Produto cadastrar(Produto produto, List<ReferenciasProduto> referencias) {
		
		produtoRepository.salvar(produto);
		referencias.forEach(referencia -> referencia.setProduto(produto));
		referenciaRepository.salvar(referencias);;
		
		return produto;
		
	}

}

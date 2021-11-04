package br.com.mirante.webservicereferencia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mirante.webservicereferencia.domain.Produto;
import br.com.mirante.webservicereferencia.domain.ReferenciasProduto;
import br.com.mirante.webservicereferencia.repository.ProdutoRepository;
import br.com.mirante.webservicereferencia.service.CadastrarProdutoService;
import br.com.mirante.webservicereferencia.service.ListarProdutoService;
import br.com.mirante.webservicereferencia.service.ListarReferenciasService;

@RestController
public class ProdutoController {
	
	
	@Autowired
	private CadastrarProdutoService cadastrarService;
	
	@Autowired
	private ListarProdutoService listarProdutoService;
	
	@Autowired
	private ListarReferenciasService listarReferenciasService;
	
	
	@GetMapping("/produtos")
	public List<Produto> listarProdutos() {

		
		
		return listarProdutoService.listarProdutos();

	}
	
	@GetMapping("/produto/{codigo}")
	public Produto recuperarProduto(@PathVariable String codigo) {
		
		
	}
	
	@PostMapping("/produtos")
	public Produto salvarProduto (@RequestBody CadastrarProdutoRequest requisicao) {
		
		return cadastrarService.cadastrar(requisicao.produto, requisicao.referencias);	
	}			
	
	}
	
	class CadastrarProdutoRequest {
		
		Produto produto;
		
		List<ReferenciasProduto> referencias;

		public Produto getProduto() {
			return produto;
		}

		public void setProduto(Produto produto) {
			this.produto = produto;
		}

		public List<ReferenciasProduto> getReferencias() {
			return referencias;
		}

		public void setReferencias(List<ReferenciasProduto> referencias) {
			this.referencias = referencias;
		}

		
		
		}
		

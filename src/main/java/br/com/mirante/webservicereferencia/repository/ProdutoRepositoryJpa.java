package br.com.mirante.webservicereferencia.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.mirante.webservicereferencia.domain.Produto;

@Repository
public class ProdutoRepositoryJpa implements ProdutoRepository{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void salvar(Produto produto) {
		entityManager.merge(produto);
	}

	@Override
	public List<Produto> listar() {
		
		return entityManager.createQuery("from Produto", Produto.class).getResultList();
	
	}

	@Override
	public Produto recuperar(String codigo) {
		
		return entityManager.find(Produto.class, codigo);

	}
		
	}
	

package br.com.mirante.webservicereferencia.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.mirante.webservicereferencia.domain.ReferenciasProduto;

@Repository
public class ReferenciaRepositoryJpa implements ReferenciaRepository{

	@Autowired
	private EntityManager entityManager;

	@Override
	public void salvar(List<ReferenciasProduto> referencias) {
		
		referencias.forEach(entityManager::merge);
	}

	@Override
	public List<ReferenciasProduto> listar() {
		return entityManager.createQuery("from ReferenciasProduto", ReferenciasProduto.class).getResultList();
	}

	
}

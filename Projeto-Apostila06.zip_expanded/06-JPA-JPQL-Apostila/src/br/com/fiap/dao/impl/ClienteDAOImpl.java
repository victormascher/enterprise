package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class ClienteDAOImpl extends GenericDAOImpl<Cliente,Integer> implements ClienteDAO{

	public ClienteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public List<Cliente> buscarAll() {
		TypedQuery<Cliente> sql = em.createQuery("from T_CLIENTE", Cliente.class);
		return sql.getResultList();
	}

	@Override
	public List<Cliente> buscarNome(Cliente nome) {
		TypedQuery<Cliente> sql = em.createQuery("from T_CLIENTE c where c.nome LIKE = :nc", Cliente.class);
		sql.setParameter("nc", "%" + nome + "%");
		return null;
	}

	
	
	
}

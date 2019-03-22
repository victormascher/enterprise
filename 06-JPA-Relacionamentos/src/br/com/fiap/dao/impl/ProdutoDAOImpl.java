package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.Produto;

public class ProdutoDAOImpl extends GenericDAOImpl<Produto, Integer> implements Produto{

	public ProdutoDAOImpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}

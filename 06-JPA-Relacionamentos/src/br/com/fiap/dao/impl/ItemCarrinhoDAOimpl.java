package br.com.fiap.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.dao.ItemCarrinhoDAO;
import br.com.fiap.entity.ItemCarrinho;

public class ItemCarrinhoDAOimpl extends GenericDAOImpl<ItemCarrinho, Integer> implements ItemCarrinhoDAO{

	public ItemCarrinhoDAOimpl(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}

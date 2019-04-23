package br.com.fiap.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.dao.PacoteDAO;
import br.com.fiap.entity.Pacote;
import br.com.fiap.entity.Transporte;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote,Integer> implements PacoteDAO{

	public PacoteDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}

	@Override
	public double somaTransporte(Transporte transporte) {
		
		return em.createQuery("select sum(p.preco) from Pacote p where p.transporte = :X", Double.class)
				.setParameter("X",transporte)
				.getSingleResult();
	}

	@Override
	public List<Pacote> buscarMaxPreco(double preco) {
		
		return em.createNativeQuery("select * from pacote where preco <= :p", Pacote.class)
				.setParameter("p",preco)
				.getResultList();
	}

}

package br.com.fiap.dao.impl;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.entity.Reserva;

public class ReservaDAOImpl extends GenericDAOImpl<Reserva,Integer> implements ReservaDAO {

	public ReservaDAOImpl(EntityManager entityManager) {
		super(entityManager);
	}
	
	
	public List<Reserva> listar(){
		//CRIA A QUERY
		
		TypedQuery<Reserva> query = em.createQuery("from Reserva", Reserva.class);
		
		//DEPOIS EXECUTA
		return query.getResultList();
	}
	
	
	public List<Reserva> searchDate(Calendar data){
		//criar type query
		TypedQuery<Reserva> query = em.createQuery("from Reserva r where r.dataReserva = :d", Reserva.class);
		
		//setar o parametro
		query.setParameter("d",data);
		
		//executar a query
		return query.getResultList(); 
	}
}

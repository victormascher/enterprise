package br.com.fiap.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.EntityManagerFactorySingleton;
import br.com.fiap.dao.ReservaDAO;
import br.com.fiap.dao.impl.ReservaDAOImpl;
import br.com.fiap.entity.Reserva;

class ReservaDAOTeste {
	
	private static ReservaDAO dao;
	
	
	@BeforeAll
	public static void start() {
		dao = new ReservaDAOImpl(EntityManagerFactorySingleton.getInstance().createEntityManager());
		
		
	}
	
	@Test
	void test() {
		
		List<Reserva> lista = dao.listar();
		
		fail("Not yet implemented");
	}
	
	@Test
	void searchDate() {
		Calendar data = new GregorianCalendar(2017, Calendar.MARCH, 20);
		List<Reserva> lista =  dao.searchDate(data);
		
		for (Reserva reserva : lista) {
			assertEquals(data, reserva.getDataReserva());
		}
		
	}
	
	
	}
	
	
		
		
	



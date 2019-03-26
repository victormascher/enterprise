package br.com.fiap.teste;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.fiap.dao.CarrinhoCompraDAO;
import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.dao.impl.CarrinhoCompraDAOImpl;
import br.com.fiap.dao.impl.ClienteDAOImpl;
import br.com.fiap.entity.CarrinhoCompras;
import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Fornecedor;
import br.com.fiap.entity.ItemCarrinho;
import br.com.fiap.entity.Produto;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

class CarrinhoCompraDAOTest {
	
	private static ClienteDAO clienteDAO;
	private static CarrinhoCompraDAO carrinhoDAO;
	
		
	@BeforeAll //método que é executado antes de todos
	public static void inicializar() {
		
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		clienteDAO = new ClienteDAOImpl(em);
		carrinhoDAO = new CarrinhoCompraDAOImpl(em);
	}

	@Test
	void test() {
		//CADASTRAR O CARRINHO E O CONENTE RELACIONADOS
		Cliente cliente = new Cliente("Sergio","12312312311");
		CarrinhoCompras carrinhoCompra = new CarrinhoCompras(cliente, 666);
		
		ItemCarrinho item1 = new ItemCarrinho();
		item1.setValor(100);
		
		ItemCarrinho item2 = new ItemCarrinho();
		item2.setValor(500);
		
		carrinhoCompra.addItem(item1);
		carrinhoCompra.addItem(item2);
		
		Fornecedor f1 = new Fornecedor("Nike", "1232133");
		Fornecedor f2 = new Fornecedor("Adidas", "4657984");
		
		List<Fornecedor> fornecedores = new ArrayList<>();
		fornecedores.add(f1);
		fornecedores.add(f2);
		
		Produto prod1 = new Produto("Bola", 100, fornecedores);
		Produto prod2 = new Produto("Papete", 200, fornecedores);
		
		item1.setProduto(prod1);
		item2.setProduto(prod2);
		
		try {
			clienteDAO.cadastrar(cliente);
			carrinhoDAO.cadastrar(carrinhoCompra);
			carrinhoDAO.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		assertNotEquals(0,cliente.getCodigo());
		assertNotEquals(0, carrinhoCompra.getCodigo());
	
		fail("Not yet implemented");
	}

}

package br.com.fiap.dao;

import java.util.List;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.Pacote;

public interface ClienteDAO extends GenericDAO<Cliente,Integer>{

	
	List<Cliente> buscarAll();
	
	List<Cliente> buscarNome(Cliente nome);
	
	List<Cliente> buscarNomeECidade(String nome, String cidade);
	
	List<Cliente> buscarPorEstados(List<String> estados);
}

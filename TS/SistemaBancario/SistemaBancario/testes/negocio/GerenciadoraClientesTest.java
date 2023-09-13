package negocio;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

/* 
 * Teste de Classe 
 * Aluno: João Victor Matulis 
 * Data: 06/09/2023
 * */

public class GerenciadoraClientesTest {
	private GerenciadoraClientes gerClientes;
	private int idCliente01 = 1;
	private int idCliente02 = 2;
	
	@Before
	public void setUp() {
		Cliente cliente01 = new Cliente(idCliente01, "João", 18, "joao@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(idCliente02, "Maria", 65, "maria@gmail.com", 1, true);
		
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);

		gerClientes = new GerenciadoraClientes(clientesDoBanco);
	}
	
	@After
	public void tearDown() {
		gerClientes.limpa();
	}
	
	@Test
	public void testPesquisaCliente() {
		Cliente cliente = gerClientes.pesquisaCliente(idCliente01);
		
		assertThat(cliente.getId(), is(idCliente01));
	}
	
	@Test
	public void testRemoveCliente() {
		boolean clienteRemovido = gerClientes.removeCliente(idCliente02);
		
		assertThat(clienteRemovido, is(true));
		assertThat(gerClientes.getClientesDoBanco().size(), is(1));
		assertNull(gerClientes.pesquisaCliente(2));
	}
	
	@Test
	public void testValidarIdade() {
		try {
			assertThat(gerClientes.validaIdade(gerClientes.pesquisaCliente(idCliente01).getIdade()), is(true));
		} catch (IdadeNaoPermitidaException e) {
			e.printStackTrace();
		}
		try {
			assertThat(gerClientes.validaIdade(gerClientes.pesquisaCliente(idCliente02).getIdade()), is(true));
		} catch (IdadeNaoPermitidaException e) {
			e.printStackTrace();
		}
		try {
			assertThat(gerClientes.validaIdade(17), is(true));
		} catch (IdadeNaoPermitidaException e) {
			e.printStackTrace();
		}
		try {
			assertThat(gerClientes.validaIdade(66), is(true));
		} catch (IdadeNaoPermitidaException e) {
			e.printStackTrace();
		}
	}
}

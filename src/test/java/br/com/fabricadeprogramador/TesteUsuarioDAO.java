package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistenca.jdbc.UsuarioDAO;
import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

public class TesteUsuarioDAO {

	public static void main(String[] args) {

		testeExcluir();
		
	}
	
	public static void testeExcluir(){
		//Excluindo o Usuario
		Usuario usu = new Usuario();
		usu.setId(4);
		
		
		//Excuindo usuario no banco de dados
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Excluido com sucesso!");
	
	
	}
	
	
	public static void testeAlterar(){
			//Alterando o Usuario
			Usuario usu = new Usuario();
			usu.setId(4);
			usu.setNome("Jaozao da Silva");
			usu.setLogin("jzao");
			usu.setSenha("123");
			
			//Alterando usuario no banco de dados
			UsuarioDAO usuDAO = new UsuarioDAO();
			usuDAO.alterar(usu);
			
			System.out.println("Alterado com sucesso!");
		
		
	}
	
	public static void testeCAdastrar(){
		
		//Criando o Usuario
				Usuario usu = new Usuario();
				usu.setNome("Jaozao");
				usu.setLogin("jzao");
				usu.setSenha("123");
				
				//Cadstrando usuario no banco de dados
				UsuarioDAO usuDAO = new UsuarioDAO();
				usuDAO.cadastrar(usu);
				
				System.out.println("Cadastrado com sucesso!");
	}

}

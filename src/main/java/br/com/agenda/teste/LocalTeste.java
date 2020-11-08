package br.com.agenda.teste;

import java.sql.SQLException;
import br.com.agenda.dao.LocalDAO;


public class LocalTeste {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*
		  UsuarioDAO dao = new UsuarioDAO();
		 * 
		 * dao.inserir("Vinicius");
		 */
		/*
		 *LocalDAO dao = new LocalDAO();
		 * 
		 * System.out.println(dao.listarTudo());
		 */
		
		LocalDAO dao = new LocalDAO();
		System.out.println("Lista Antes da atualização");
		System.out.println(dao.listarTudo());
		
		LocalDAO daoUpdate = new LocalDAO();
		daoUpdate.alterar("Centrais eletricas de santa catarina", 1L);
		
		System.out.println("Lista atualizada");
		LocalDAO pesq= new LocalDAO();
		System.out.println(pesq.listarTudo());
	
	
	
	}

}

package br.com.agenda.teste;

import java.sql.SQLException;
import br.com.agenda.dao.UsuarioDAO;

public class UsuarioTeste {
	
	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		
		/*
		 * LocalDAO dao = new LocalDAO();
		 * 
		 * dao.inserir("posto de gasolina");
		 */
		
		UsuarioDAO dao = new UsuarioDAO();
		
		System.out.println(dao.listarTudo());
	}
	

}

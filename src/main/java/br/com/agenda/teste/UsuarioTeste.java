package br.com.agenda.teste;

import java.sql.SQLException;
import br.com.agenda.dao.LocalDAO;

public class UsuarioTeste {
	
	public static void main (String[] args) throws ClassNotFoundException, SQLException {
		
		LocalDAO dao = new LocalDAO();
		
		dao.inserir("posto de gasolina");
		
	}
	

}

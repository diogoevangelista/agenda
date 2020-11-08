package br.com.agenda.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import br.com.agenda.data.Conexao;
import br.com.agenda.data.ConexaoMySql;

import br.com.agenda.model.Local;

public class LocalDAO {

	private final Conexao conexao;

	public LocalDAO() throws SQLException, ClassNotFoundException {
		this.conexao = new ConexaoMySql();

	}
	
	
	// Create - criar
	public void inserir(String nomeLocal) throws SQLException {
		String query = "insert into local(nome) values (?);";

		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(query);
			stmt.setString(1, nomeLocal);
			stmt.execute();

			this.conexao.commit();
		} catch (SQLException e) {
			this.conexao.rollback();
			throw e;

		}

	}
	
	
	// Read - ler tudo
	public List<Local> listarTudo() throws SQLException, ClassNotFoundException {
		String sql = "select id, nome from local order by nome;";

		try {
			PreparedStatement st = this.conexao.getConnection().prepareStatement(sql);
			ResultSet rs = st.executeQuery();

			List<Local> listaPesquisada = new ArrayList<>();

			while (rs.next()) {
				Local local = new Local(rs.getLong("id"), rs.getString("nome"));
				listaPesquisada.add(local);
			}
			return listaPesquisada;
		} catch (SQLException exception) {
			throw exception;
		}

	}
	
	
	// Update - atualizar
	public void alterar(String nomeAtualizado, Long id) throws SQLException {
		String sql = "update local set nome = ? where id = ?";
		
		try {
		PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sql);
		stmt.setString(1, nomeAtualizado);
		stmt.setLong(2, id);
		stmt.execute();
		
		this.conexao.commit();
		}catch (SQLException e) {
			this.conexao.rollback();
			throw e;
			
			
		
		}
	
		}
	
	// Delete - Excluir
	public void excluir(String nomeDeletado, Long id) throws SQLException {
		String sql = "delete from local where id = ?"; 
		
		try {
			PreparedStatement stmt = this.conexao.getConnection().prepareStatement(sql);
			stmt.setString(1, nomeDeletado);
			stmt.setLong(1, id);
			stmt.execute();
			
			this.conexao.commit();
			}catch (SQLException e) {
				this.conexao.rollback();
				throw e;
				
				
			
			}
		
		
		
	}

	
}

package br.com.caelum.jdbc.dao;

import java.util.*;
import java.sql.*;
import br.com.caelum.jdbc.*;
import br.com.caelum.jdbc.modelo.*;

public class FuncionarioDao {
	
	private Connection connection;
	
	public FuncionarioDao() {
	this.connection = new ConnectionFactory().getConnection();
	}



		public void adiciona(Funcionario func) {
				String sql = "insert into funcionario " + "(nome,usuario,senha)" + " values (?,?,?)";

					try {
						PreparedStatement ins = connection.prepareStatement(sql);

						ins.setString(1,func.getNome());
						ins.setString(2,func.getUsuario());
						ins.setString(3,func.getSenha());
						ins.execute();
						ins.close();
						} catch (SQLException e) {
							throw new RuntimeException(e);
						}
				}
		
		
			public List<Funcionario> getLista() {
					try {
						List<Funcionario> funcionarios = new ArrayList<Funcionario>();
						PreparedStatement ins = this.connection.
						prepareStatement("select * from funcionario");
						ResultSet x = ins.executeQuery();
						
				    while (x.next()) {
				    	Funcionario funcion = new Funcionario();
				    		funcion.setId(x.getLong("id"));
				    		funcion.setNome(x.getString("nome"));
				    		funcion.setUsuario(x.getString("usuario"));
				    		funcion.setSenha(x.getString("senha"));
		
				    		funcionarios.add(funcion);
				    	}
				    		x.close();
				    		ins.close();
				    		return funcionarios;
						} catch (SQLException e) {
							throw new RuntimeException(e);
						}
			}
			
			
			
			public void altera(Funcionario funcionarios) {
			String sql = "update funcionario set nome=?, usuario=?, senha=? where id=?";
				 try {
				PreparedStatement alt = connection.prepareStatement(sql);
				
				alt.setString(1, funcionarios.getNome());
				alt.setString(2, funcionarios.getUsuario());
				alt.setString(3, funcionarios.getSenha());
				alt.setLong(4, funcionarios.getId());
				
				alt.execute();
				alt.close();
				} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
			
			public void remove(Funcionario funcionarios) {
				try {
					PreparedStatement dlt = connection.prepareStatement("delete from funcionario where id=?");
					
					dlt.setLong(1, funcionarios.getId());
					dlt.execute();
					dlt.close();
				} catch (SQLException e) {
					throw new RuntimeException(e);
				}
			}
					
	}
package br.com.caelum.jdbc.teste;

import java.sql.*;
import br.com.caelum.jdbc.ConnectionFactory;

/**
 * @author manoel.leao
 *
 */
public class TestaConexao {
	
	public static void main(String args[]) throws SQLException{
		
		Connection connection = new ConnectionFactory().getConnection();
			System.out.println("Conex�o Aberta!");
			connection.close();
		
	}

}

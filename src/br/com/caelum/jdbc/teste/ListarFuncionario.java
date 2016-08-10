package br.com.caelum.jdbc.teste;

import java.util.List;

import javax.swing.JOptionPane;

import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class ListarFuncionario {
	public static void main(String args[]){
		
		FuncionarioDao dao = new FuncionarioDao();
		
		List<Funcionario> funcionario = dao.getLista();
		
		for (Funcionario funcio : funcionario) {
			
JOptionPane.showMessageDialog(null,"VISUALIZAÇÃO \n Nome: " + funcio.getNome()+"\nUsuario: " + funcio.getUsuario()+"\nSenha: " + funcio.getSenha());
			
		}
	}

}

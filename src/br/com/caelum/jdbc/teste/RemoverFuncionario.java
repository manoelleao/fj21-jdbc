package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class RemoverFuncionario {
	public static void main(String args[]){
		
		Funcionario funcionarios = new Funcionario();		
		funcionarios.setId(Long.parseLong(JOptionPane.showInputDialog("EXCLUSÃO \n Digite um ID para excluir: ")));
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.remove(funcionarios);
		JOptionPane.showMessageDialog(null, "Funcionario removido com sucesso!");
			
	}


}

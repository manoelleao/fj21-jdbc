package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class CadastrarFuncionario {
	public static void main(String args[]){
		
		Funcionario funcionarios = new Funcionario();
		
		funcionarios.setNome(JOptionPane.showInputDialog("INSER��O \n Nome: "));
		funcionarios.setUsuario(JOptionPane.showInputDialog("INSER��O \n Usuario "));
		funcionarios.setSenha(JOptionPane.showInputDialog("INSER��O \n Senha "));
		
		
		FuncionarioDao dao = new FuncionarioDao();
		
		dao.adiciona(funcionarios);

		JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso!");

		
		
	}

}

package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;
import br.com.caelum.jdbc.dao.FuncionarioDao;
import br.com.caelum.jdbc.modelo.Funcionario;

public class AlterarFuncionario {
	public static void main(String args[]){
		
		Funcionario funcionarios = new Funcionario();

		funcionarios.setId(Long.parseLong(JOptionPane.showInputDialog("ALTERA플O \n Digite o Id do Funcionario que deseja alterar: ")));
		funcionarios.setNome(JOptionPane.showInputDialog("ALTERA플O \n Digite o nome: "));
		funcionarios.setUsuario(JOptionPane.showInputDialog("ALTERA플O \n Digite o usuario: "));
		funcionarios.setSenha(JOptionPane.showInputDialog("ALTERA플O \n Digite a senha: "));

			


		FuncionarioDao dao = new FuncionarioDao();

dao.altera(funcionarios);

		JOptionPane.showMessageDialog(null, "Funcionario alterado com sucesso!");

}

}

package br.com.caelum.jdbc.teste;

import javax.swing.*;
import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;
import br.com.caelum.util.*;

		public class TestaAltera {
			public static void main(String args[]){
		
				Contato contato = new Contato();
		
					contato.setId(Long.parseLong(JOptionPane.showInputDialog("ALTERA��O \n Digite o Id: ")));
					contato.setNome(JOptionPane.showInputDialog("ALTERA��O \n Digite o nome: "));
					contato.setEndereco(JOptionPane.showInputDialog("ALTERA��O \n Digite o endere�o: "));
					contato.setEmail(JOptionPane.showInputDialog("ALTERA��O \n Digite o e-mail: "));
					contato.setDataNascimento(FormataData.Formata(JOptionPane.showInputDialog("ALTERA��O \n Digite a data de nascimento: ")));
					
		
		
		ContatoDao dao = new ContatoDao();
		
		dao.altera(contato);

		JOptionPane.showMessageDialog(null,"Alterado!");
	}

}

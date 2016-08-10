package br.com.caelum.jdbc.teste;

import javax.swing.JOptionPane;
import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaExclui {
	
	public static void main(String args[]){
		
		Contato contato = new Contato();		
		contato.setId(Long.parseLong(JOptionPane.showInputDialog("EXCLUSÃO \n Digite um ID para excluir: ")));
		
		ContatoDao dao = new ContatoDao();
		
		dao.remove(contato);
		System.out.println("Excluido!");
			
	}

}

package br.com.caelum.jdbc.teste;

import javax.swing.*;
import br.com.caelum.util.*;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {
	public static void main(String args[]){
		
		Contato contato = new Contato();
		
		contato.setNome(JOptionPane.showInputDialog("INSER��O \n Seu nome: "));
		contato.setEndereco(JOptionPane.showInputDialog("INSER��O \n Seu endere�o "));
		contato.setEmail(JOptionPane.showInputDialog("INSER��O \n Seu e-mail "));
		contato.setDataNascimento(FormataData.Formata(JOptionPane.showInputDialog("INSER��O \n Data de nascimento ")));
		
		
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);

		System.out.println("Gravado!");

		
		
	}

}

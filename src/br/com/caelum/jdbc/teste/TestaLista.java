package br.com.caelum.jdbc.teste;

import java.util.*;
import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	public static void main(String args[]){
		
		ContatoDao dao = new ContatoDao();
		
		List<Contato> cont = dao.getLista();
		
		for (Contato contact : cont) {
			
			System.out.println("VISUALIZAÇÃO \n Nome: " + contact.getNome());
			System.out.println("Email: " + contact.getEmail());
			System.out.println("Endereço: " + contact.getEndereco());
			//System.out.println("Data de Nascimento: " + contact.getDataNascimento()+"\n");
		}
	}

}

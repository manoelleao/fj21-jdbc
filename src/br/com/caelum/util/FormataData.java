package br.com.caelum.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class FormataData {
	/*private FormataData(){
		
	}*/
	
	public static Calendar Formata(String data){
		Date date;
		try {
			date = new SimpleDateFormat("dd/MM/yyyy").parse(data);
			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			
			return dataNascimento;
		} catch (java.text.ParseException e) {
			throw new RuntimeException("Erro ao converter data", e);
		}
		
	}
}


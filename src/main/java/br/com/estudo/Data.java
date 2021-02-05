package br.com.estudo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Data 
{
	public static void main(String[] args)
	{
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatador.format(hoje));
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println(formatador.format(agora));
		
		formatador = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.CHINA);
		System.out.println(formatador.format(agora));
		
		System.out.println(agora.minusHours(5));
	}
}

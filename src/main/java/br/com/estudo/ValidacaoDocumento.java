package br.com.estudo;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import br.com.caelum.stella.validation.Validator;

public class ValidacaoDocumento 
{
	public static void main(String[] args) 
	{
		// Valida CPF
		String cpf = "86288366757";
		try 
		{
			validadorDocumento(new CPFValidator(), cpf);
			System.out.println("CPF válido.");
			
		} 
		catch (InvalidStateException e) 
		{
			System.out.println("CPF inválido: " + cpf);
		}
		
		// Valida CNPJ
		String cnpj = "82588641000173";
		try 
		{
			validadorDocumento(new CNPJValidator(), cnpj);
			System.out.println("CNPJ válido.");
			
		} 
		catch (InvalidStateException e) 
		{
			System.out.println("CNPJ inválido: " + cnpj);
		}
		
		// Valida Titulo de Eleitor
		String tituloEleitor = "417453530116";
		try 
		{
			validadorDocumento(new TituloEleitoralValidator(), tituloEleitor);
			System.out.println("Título de eleitor válido.");
		}
		catch (InvalidStateException e) 
		{
			System.out.println("Título de eleito inválido: " + tituloEleitor);
		}
	}
	
	private static void validadorDocumento(Validator<String> validador, String documento)
	{
		validador.assertValid(documento);
	}
}

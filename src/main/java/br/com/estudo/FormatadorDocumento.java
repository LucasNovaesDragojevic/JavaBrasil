package br.com.estudo;

import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.Formatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumento 
{
	public static void main(String[] args) 
	{
	    String cpf = "862.883.667-57";
	    String cnpj = "98.610.832/0001-24";
	    String tituloEleitor = "417453530116";
	    
	    // Desformatando CPF
	    try
	    {
	    	String cpfDesformatado = desformatarDocumentos(new CPFFormatter(), cpf);
	    	System.out.println("CPF desformatado: " + cpfDesformatado);
	    }
	    catch (IllegalArgumentException e) 
	    {
	    	System.out.println("CPF inválido: " + cpf);
		}
	    
	    // Desformatando CNPJ
	    try
	    {
	    	String cnpjDesformatado = desformatarDocumentos(new CNPJFormatter(), cnpj);
	    	System.out.println("CNPJ desformatado: " + cnpjDesformatado);
	    }
	    catch (IllegalArgumentException e) 
	    {
	    	System.out.println("CNPJ inválido: " + cpf);
		}
	    
	    // Formatando Título de Eleitor
	    try
	    {
	    	String tituloEleitorFormatado = formatadorDocumento(new TituloEleitoralFormatter(), tituloEleitor);
	    	System.out.println("Titulo Eleitor formatado: " + tituloEleitorFormatado);
	    }
	    catch (IllegalArgumentException e) 
	    {
	    	System.out.println("Titulo Eleitor  inválido: " + cpf);
		}
	}
	
	private static String formatadorDocumento(Formatter formatador, String documento) 
	{
		return formatador.format(documento);
	}

	private static String desformatarDocumentos(Formatter formatador, String documento)
	{
		return formatador.unformat(documento);
	}
}

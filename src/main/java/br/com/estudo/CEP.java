package br.com.estudo;

import java.io.IOException;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

public class CEP 
{

	public static void main(String[] args) throws IOException 
	{
		ViaCEPClient cliente = new ViaCEPClient();
		ViaCEPEndereco endereco = cliente.getEndereco("82010340");
		System.out.println(endereco.getIbge());
	}

}

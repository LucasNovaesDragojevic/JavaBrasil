package br.com.estudo;

import java.util.Collection;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;

public class Dinheiro 
{

	public static void main(String[] args) 
	{
		CurrencyUnit moeda = Monetary.getCurrency("BRL");
		MonetaryAmount valorParcela = Money.of(75, moeda);
		System.out.println(valorParcela);
		
		MonetaryAmount valorTotal = valorParcela.multiply(12);
		System.out.println(valorTotal);
	}

}

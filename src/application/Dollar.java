package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Dollar {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor do dólar: ");
		
		System.out.println("Quantos dolares você vai comprar: " );
		
		System.out.println("Quantos irei pagar em reais: " );
		
		System.out.printf("resultado: ", CurrencyConverter.valorDolar(0));
		
		sc.close();
	}

}

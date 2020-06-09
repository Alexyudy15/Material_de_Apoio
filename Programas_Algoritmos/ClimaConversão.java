package br.com.java;

import java.util.Scanner;

public class ClimaConversão {

	public static void main(String[] args) {
		
		

		double fahr, clima, conversao;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("===============Conversao de Fahrenheit para Celsius=============");
		System.out.println("");
		System.out.println("________________________________________________________________");
		
		//Entrada
		System.out.println("Digite o valor de Fahrenheit: ");
		fahr = teclado.nextDouble();
		
		//Processamento
		clima = (fahr - 32);
		conversao = (clima / 1.8);
		
		//saída
		System.out.println("Celsius: " + conversao);

	}

}

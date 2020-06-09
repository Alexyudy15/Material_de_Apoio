package br.com.java;

import java.util.Scanner;

public class RealparaDollar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		double dolar, real;
		System.out.println("==========================================");
		System.out.println("=====Conversão Dollar para Real===========");
		System.out.println("==========================================");
		System.out.print("digite o valor do Dollar: ");
		dolar = teclado.nextDouble();
		//processamento 
		real = (dolar * 3.73);
		//saida 
		System.out.println(" valor do real: " + real);

	}

}

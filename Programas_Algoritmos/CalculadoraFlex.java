package br.com.java;

import java.util.Scanner;

public class CalculadoraFlex {

	public static void main(String[] args) {
		//variáveis
		double alcool, gasolina;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora FLEX");
		// entrada
		System.out.println("Digite o valor do álcool: ");
		alcool = teclado.nextDouble();
		System.out.println("Digite o valor da gasolina: ");
		gasolina = teclado.nextDouble();
		// processamento / saída
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abasteça com Álcool");
		} else {
			System.out.println("Abasteça com Gasolina");
		}
	}

}

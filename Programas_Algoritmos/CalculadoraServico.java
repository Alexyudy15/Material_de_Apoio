package br.com.java;

import java.util.Scanner;

public class CalculadoraServico {

	public static void main(String[] args) {
		double remuneracao, custo, horas, servico, estimativa, total;
		Scanner teclado = new Scanner(System.in);
		System.out.println("--------Calculadora do serviço-------");
		System.out.println("=====================================");
		System.out.println("");
		System.out.print("Remuneração mensal pretendida: ");
		remuneracao = teclado.nextDouble();
		System.out.print("Custo operacional mensal: ");
		custo = teclado.nextDouble();
		System.out.print("Carga horária mensal de trabalho: ");
		horas = teclado.nextDouble();
		servico = (remuneracao + (remuneracao * 0.3) + custo + (remuneracao * 0.2 )) / horas;
		System.out.println("Valor da hora de serviço: " + servico);
		System.out.println("=====================================");
		System.out.println("");
		System.out.print("Estimativa de horas deste serviço: ");
		estimativa = teclado.nextDouble();
		total = estimativa * servico;
		System.out.println("Valor a ser cobrado deste cliente: " + total);
		
		

	}

}

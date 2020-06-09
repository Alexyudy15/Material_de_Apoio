package br.com.java;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		char opcao;
		Scanner teclado = new Scanner(System.in);
		do {
			//a linha abaico usa a classe Random para criar um objeto que será usado para gerar números aleatórios
			Random dado = new Random();
			int face = dado.nextInt(6) + 1; //gerar números aleatórios (0 a 5) //somamos 1 ao resultado pois não existe face 0 no dado
			System.out.println("Face do dado: " + face);
			System.out.println("Deseja Jogar novamente(s/n)?");
			opcao = teclado.next().charAt(0);
		} while (opcao == 's');

	}

}

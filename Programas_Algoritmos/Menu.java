package br.com.java;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		int opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("1. Windows");
		System.out.println("2. Linux");
		System.out.println("Digite a opção desejada: ");
		opcao = teclado.nextInt();
		switch (opcao) {
		case 1:
			Windows();
			break;
		case 2:
			Linux();
			break;
			default:
				System.out.println("Opção invalida");
				break;
		}

	}
	
	//criando um método 
	static void Windows() {
		System.out.println("Carregando o Windows.........");
	}
	static void Linux() {
		System.out.println("Carregando o Linux.............");
	}

}

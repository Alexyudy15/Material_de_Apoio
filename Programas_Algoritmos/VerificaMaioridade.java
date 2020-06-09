package br.com.java;

import java.util.Scanner;

public class VerificaMaioridade {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a sua idade: ");
	    idade = teclado.nextInt();
	    System.out.println("");
	    System.out.println("=========================");
	    System.out.println("Nome:" + nome);
	    System.out.println("Idade:" + idade);
	    if (idade >= 18) {
	    	System.out.println("=========================");
	    	System.out.println("Maior de idade (:");
			
		} else {
            System.out.println("Menor de idade ):");
		}
	    
		
		
		
		

	}

}

package br.com.java;

import java.util.Scanner;

public class VerificarObrigatoriedadeDeVotar {

	public static void main(String[] args) {
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("'Verificar brigatoriedade de votar'");
		System.out.println("Digite a sua idade: ");
		idade = teclado.nextInt();
		/*Critérios
		 * Menor que 16 anos - Proibido votar
		 * 16, 17 ou acima de 70 - Voto facultativo
		 * Entre 18 e 70 - Obrigatório votar
		 */
		
	    if (idade < 16) {
			System.out.println("Proibido votar");
		} else if (idade == 16 || idade == 17 || idade > 70)
			System.out.println("Voto facultativo");
			else {
				System.out.println("Voto obrigatório");
			}
			
				
			}

		
	}



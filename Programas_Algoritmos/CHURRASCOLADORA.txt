/**
 * atividade de avaliação - Churrascoladora
 * @author Matheus Muniz, Alex Yudy, Kevin Souza
 */
package br.com.java;

import java.util.Scanner;

public class Churrascoladora {

	public static void main(String[] args) {
		// variáveis
		int homem, mulher, crianca,mulhercerveja,criancarefri,mulherefri,homemcerveja,totalchurras;
		double cerveja, carne, refri, adultocarne, criancacarne,carvao,valorcarne,valorefri,valorcerveja,valorchurras;
		Scanner teclado = new Scanner(System.in);
		// entrada
		System.out.println("=== CHURRASCOLADORA ====");
		System.out.println("");
		System.out.println("Quantidade de Homens: ");
		homem = teclado.nextInt();
		System.out.println("Quantidade de mulheres: ");
		mulher = teclado.nextInt();
		System.out.println("Quantidade de crianças: ");
		crianca = teclado.nextInt();
		System.out.println("Preço médio do Kg da Carne: ");
		carne = teclado.nextDouble();
		System.out.println("Preço médio da lata de cerveja: ");
		cerveja = teclado.nextDouble();
		System.out.println("Preço médio da lata de refri: ");
		refri = teclado.nextDouble();
		// processamento  
		
		//critérios
		adultocarne = (homem+mulher*0.300);
		criancacarne = (crianca*0.100);
		homemcerveja =(homem*12);
		mulhercerveja=(mulher*4);
		mulherefri=(mulher*2);
		criancarefri = (crianca*2);
		valorcerveja = (homemcerveja+mulhercerveja*cerveja);
		valorefri = (criancarefri+mulherefri*refri);
		valorcarne = (adultocarne*carne);
		totalchurras = (homem+mulher);
		valorchurras = (valorcerveja+valorcarne+valorefri);
		
		//calculando o 

		// saida
		System.out.println("");
		System.out.println("_______________________________");
		System.out.println("Lista de compras ");
		System.out.println("Quantidade total de carne: " + adultocarne +" KG ");
		System.out.println("Quantidade total de cerveja: " + (homemcerveja+mulhercerveja + " latas "));
		System.out.println("Quantidade toal de refri: " + (mulherefri + criancarefri + " latas "));
		System.out.println("");
		System.out.println("________________________________");
		System.out.println("Valor total do Churas: " + (valorcerveja+valorcarne+valorefri));
		System.out.println("valor por pessoa: " + valorchurras/totalchurras );

	}

}

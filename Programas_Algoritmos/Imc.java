/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suporte;

import java.util.Scanner;

/**
 *
 * @author Alex Yudy Kitahara
 * Exercício 9
 * Calculo IMC
 */
public class Imc {
    public static void main(String[] args) {
		
		Float peso,altura,imc;
		System.out.println("==== Calculo do IMC ====");
		System.out.print("Digite o seu Peso em kg:");
		
		Scanner teclado = new Scanner(System.in);
		
		peso = teclado.nextFloat();
		System.out.print("Digite a sua altura em metros: ");
		altura = teclado.nextFloat();
		
		imc = peso/ (altura * 2) ;
		
		System.out.println("IMC:" + imc);
                if (imc < 20.00)
                      System.out.println ("Abaixo do peso, Cuidado!");
                else if ((imc > 20.00) &&(imc <25.00))
                      System.out.println ("Voce esta no peso ideal, parabens!");
                else if (imc > 25.0)
                      System.out.println("Voce está acima do peso, vamos malhar?");
                
                
	}

	}
    

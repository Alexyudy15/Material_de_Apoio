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
 * Exercício 10
 * Média de Aluno
 */
public class MediaAluno {
    public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float nota1, nota2,nota3,exame,media,calculoFinal;
                
                System.out.println("=============>>Média Aluno<<============= \n");
		
		System.out.print("Digite a nota 1: ");
			
		nota1 = teclado.nextFloat();
		System.out.print("Digite a nota 2: ");
		nota2 = teclado.nextFloat();
                System.out.print("Digite a nota 3: ");
		nota3 = teclado.nextFloat();
	
		media = (nota1+nota2+nota3) / 3;
	
		System.out.println("Média final:" + media);
		if (media >= 7) {
			System.out.println("APROVADO: média de " + media);
                        
		}
                else if(media < 7){
                      System.out.println("REPROVADO: PORÉM PODE FAZER A PROVA DO EXAME");  
                      System.out.println("-----------------------------------------------------------------");
                }
                
                        else {
			System.out.println("VALOR DESCONHECIDO");
		}
                
                 System.out.print("Digite a nota do exame: ");
                        exame = teclado.nextFloat();
                        calculoFinal = (exame+media)/2;

                        
                        if(calculoFinal < 5){
                            System.out.print("REPROVADO " + calculoFinal);
                        }
                        
                        else{
                        System.out.print("APROVADO EM EXAME " + calculoFinal);
                        }
                
               
	}
}

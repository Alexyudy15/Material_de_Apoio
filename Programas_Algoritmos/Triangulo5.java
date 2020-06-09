/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AvaliacaoAlexandre;

import java.util.Scanner;

/**
 *
 * @author Alex Yudy Kitahara
 * 
 * (2,0) Criar um programa que leia 3 números reais A, B e C e ordene-os em ordem decrescente, de modo que o lado
A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base
nos seguintes casos, sempre escrevendo uma mensagem adequada:
 */
public class Triangulo5{
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int A, B, C; 

      	System.out.print("==================* Triangulo//Isósceles//Escaleno *==================\n\n");


        System.out.print("Digite o lado A: ");
        A = entrada.nextInt(); 
		
        System.out.print("Digite o lado B: ");
        B = entrada.nextInt();
		
	System.out.print("Digite o lado C: ");
        C = entrada.nextInt(); 
        
        System.out.println("=====================================================");

        if(A>B && A>C){
            System.out.println("O maior lado é o A: " + A);
        }
        else if(B>A && B>C){
            System.out.println("O maior lado é o B: " + B);
        }
        else{
            System.out.println("O maior lado é o C " + C);
        }
        
        System.out.println("=====================================================");


			if( A > B + C){ 
				System.out.println("Não forma um Triangulo.");
			}
                        else if(A*A == B*B + C*C){
                            System.out.println("O triângulo é Retangulo.");
                        }
                        else if(A*A > B*B + C*C){
                            System.out.println("O triângulo é Obtusangulo.");
                        }
                        else if(A*A < B*B + C*C){
                            System.out.println("O triângulo é Acutangulo.");
                        }
                        else if(A==B || A==C || B==C){ 
                            System.out.println("O triângulo é Equilatero.");
			}
                        else if(A==B || B==C ){
                            System.out.println("O triângulo é Isosceles.");
                        }
                
    }
    
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suporte;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class equacao {
    public static void main(String[] args){
    int min,max;
    float a,b,x;
    
    Random sorteio = new Random();
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("===========Equação do 1º grau===========");
    System.out.print("");
    
    System.out.print("Informe o valor minímo:");
    min = teclado.nextInt();
    System.out.println("---------------------------------------------------------");
    System.out.print("Informe o valor máximo: ");
    max = teclado.nextInt();
    System.out.println("---------------------------------------------------------");
    
    a=sorteio.nextInt((max-min)+1) + min;
    b=sorteio.nextInt((max-min)+1) + min;
    
    
     System.out.println("Números gerados: " + "A: " + a + " e B: " +b);
     System.out.println("---------------------------------------------------------");
     System.out.println("");
     
     while(a==0){
         a=sorteio.nextInt((max-min)+1) + min;
         System.out.println(" Novos números gerados: " + "A: " + a + " e B: " +b);
         System.out.println("---------------------------------------------------------");
 
     }
     
     while(b==0){
         b=sorteio.nextInt((max-min)+1) + min;
         System.out.println(" Novos números gerados: " + "A: " + a + " e B: " +b);
         System.out.println("---------------------------------------------------------");
 
     }
     
     x=-b/a;
     System.out.print("O valor de X é: " +x);
     

    
    
    }
}

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
 * 2. (1,0) Criar um programa que leia três números inteiros e apresente na tela o maior deles
 */
public class MaiorNumero2 {
    public static void main(String[] args){
        Scanner teclado =  new Scanner(System.in);
        int n1,n2,n3;
        
       System.out.println("=============Maior número================ \n");
       
       System.out.print("Digite o 1º número: ");
       n1 = teclado.nextInt();
       
       System.out.print("========================================= \n");
       
       System.out.print("Digite o 2º número: ");
       n2 = teclado.nextInt();
       
       System.out.print("========================================= \n");
       
       System.out.print("Digite o 3º número: ");
       n3 = teclado.nextInt();
       
       System.out.print("========================================= \n");
 
       if(n1>n2 && n1>n3){
           System.out.println("O Maior número é: " + n1);
       }
       else if(n2>n1 && n2>n3){
           System.out.println("O Maior número é: " + n2);
       }
       else{
           System.out.println("O Maior número é: " + n3);
       }
        
 
}
    
}

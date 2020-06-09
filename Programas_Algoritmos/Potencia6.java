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
 * 6. (1,0) Criar um programa que leia dois valores inteiro X e Z, calcula e apresente na tela XZ (sem utilizar funções
ou operadores de potência prontos).
 */
public class Potencia6 {
    public static void main(String[] args){
        Scanner teclado =  new Scanner(System.in);
        int x,z,potencia=1;
        
       System.out.println("=============Potência================ \n");
       
       System.out.print("Digite o 1º que vai ser X: ");
       x = teclado.nextInt();
       
       System.out.print("========================================= \n");
       
       System.out.print("Digite o 2º número que vai ser Z: ");
       z = teclado.nextInt();
       
       if(z==0){
           System.out.println("Valor Inválido! ");
       }
       else{
           for(int i=0; i< z; i++){
               potencia*=x;
           }
       System.out.print("========================================= \n");
       System.out.println("O resultado da Potência é: " + potencia);
       }

       
       
       
       
       
       
       
       
       
       
       
       
       
       
    
    }
}

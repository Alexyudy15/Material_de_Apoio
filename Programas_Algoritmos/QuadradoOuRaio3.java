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
 * 3. (1,0) Criar um programa que leia dois números L e R. O programa deve verificar a maior área entre um quadrado
de lado L e um círculo de raio R. Imprimir na tela qual o maior: "Quadrado" ou "Circulo".
 */
public class QuadradoOuRaio3 {
     
   
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        Double L,R,calculoL,calculoR,quadrado,result;
        final double PI = 3.1416;
        
        System.out.println("=============Qual é maior? Quadrado ou Raio================ \n");
       
        System.out.print("Digite a área do quadrado de lado L: ");
        L = teclado.nextDouble();
       
        System.out.print("========================================= \n");
       
        System.out.print("Digite a área do Raio de lado R:");
        R = teclado.nextDouble();
        
        calculoL = L*L;
 
        calculoR  = PI* (R*R);
        
        if(calculoR > calculoL){
            System.out.print("========================================= \n");
            System.out.println("O Raio é maior do que o Quadrado: " + calculoR);

        }
        else if(calculoR == calculoL){
            System.out.print("========================================= \n");
            System.out.println("Os dois são do mesmo tamanho: " + calculoR);
        }
        else{
            System.out.print("========================================= \n");
            System.out.println("O Quadrado é maior do que o Raio: " + calculoL);
        }
        
        
         
    
        
        
        
        
        
        
        
        
        
        
    }
    
    
}

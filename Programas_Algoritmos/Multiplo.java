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
 * Exercício 7
 * Números multiplos
 */
public class Multiplo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int i,numero,multiplo,calculo;
        
        System.out.println("=============>>Multiplos<<============= \n");
        System.out.print("Digite o primeiro número: ");
        numero = teclado.nextInt();
        
        System.out.print("Digite o segundo número: ");
        multiplo = teclado.nextInt();
        
        if(numero % multiplo == 0){
            System.out.print("Sim! o primeiro é multiplo do segundo!");
        }
        else{
            System.out.print("Não! o primeiro não é multiplo do segundo!");
        }
        
        
        
    }
    
}

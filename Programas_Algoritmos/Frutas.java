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
 * Exercício 6 
 * Maças
 */
public class Frutas {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Double fruta;
        Double valor1, valor2;
        Double calculo;
        
        System.out.println("=============>>Compras de Maças<<============= \n");
        
        System.out.println("Quantas maçãs foram compradas: ");
        fruta = teclado.nextDouble();
        
        if(fruta>=12){
        valor1 = 1.00*fruta;
        System.out.printf("O valor total da compra é: R$ %.2f",valor1);
        }
        else if(fruta < 12){
        valor2 = 1.30*fruta;
        System.out.printf("O valor total da compra é:R$ %.2f", valor2);
        }
        else{
        System.out.print("Não é valido esse valor");
        }
    }
    
    
}

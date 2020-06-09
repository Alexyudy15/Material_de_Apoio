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
 * Exercício 1 
 * Salário Minimo
 */
public class SalarioMinimo {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int salarioMinimo,salario,valorFinal;
        
        System.out.println("=============>>Salário Minímo<<============= \n");
        
        System.out.print("Digite o seu salário: ");
        salario = teclado.nextInt();
        
        System.out.print("Digite o valor do salário minímo: ");
        salarioMinimo = teclado.nextInt();
        
        valorFinal = salario/salarioMinimo;
         
        
        System.out.print("Você recebe " + valorFinal + " salários minímos");
    }
}

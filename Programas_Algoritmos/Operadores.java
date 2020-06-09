/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suporte;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Operadores {
    public static void main(String[] args){
  int numero1,numero2;
  String operacao;
  Scanner teclado = new Scanner(System.in);
  
System.out.print("Digite o 1º numero: ");
  numero1 = teclado.nextInt();
  System.out.print("Digite o 2º numero: ");
  numero2 = teclado.nextInt();
  
  System.out.println("<+>  Adição");
  System.out.println("<->  Subtração");
  System.out.println("<*>  Multiplicação");
  System.out.println("</>  Divisão \n");
  
  System.out.print("Digite o Operador desejado: ");
  operacao = teclado.next();
  
  
  switch (operacao){
    case "+":    
    System.out.println("Soma: " + (numero1+numero2));
    break;
    case "-":
    System.out.println("Subtração: " + (numero1-numero2));
    break;
    case "*":
    System.out.println("Multiplicação: " + (numero1*numero2));
    break;
    case "/":
    System.out.println("Divisão: " + (numero1/numero2));
    break;
    default:
        System.out.println("Operação Incorreta");
        
   
  }
  
}
    
}

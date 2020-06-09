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
public class DiaSemana {
    public static void main(String[] args){
  Scanner teclado = new Scanner(System.in);
  int diaSemana;
  
  System.out.print("Digite o dia de 1 à 6: ");
  diaSemana = teclado.nextInt();
  
  switch(diaSemana){
    case 1:
    System.out.println("Domingo");
    break;
    case 2:
    System.out.println("Segunda-feira");
    break;
    case 3:
    System.out.println("Terça-feira");
    break;
    case 4:
    System.out.println("Quarta-feira");
    break;
    case 5:
    System.out.println("Quinta-feira");
    break;
    case 6:
    System.out.println("Sexta-feira");
    break;
    case 7:
    System.out.println("Sabádo");
    break;
    default:
    System.out.print("Valor Inválido");
    
  }
}
    
}

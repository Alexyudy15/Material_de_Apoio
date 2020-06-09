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
public class Ano {
    public static void main(String[] args){
  int ano;
  Scanner teclado =new Scanner(System.in);
  
  System.out.print("Digite um mês de 1 a 12: ");
  ano = teclado.nextInt();
  
  switch (ano){
    case 1:
    System.out.println("Janeiro: Férias");
    break;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6: 
    System.out.println("Fevereiro à Junho: Primeiro Semestre letivo");
    break;
    case 7:
    System.out.println("Julho: Recesso");
    break;
    case 8:
    case 9:
    case 10:
    case 11:
    System.out.println("Agosto à Novembro: Segundo Semestre letivo");
    break;
    case 12:
    System.out.println("Dezembro: Férias");
    break;
  }
  
}
    
}

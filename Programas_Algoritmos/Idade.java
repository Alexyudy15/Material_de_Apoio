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
 * Exercício 2
 * Idade
 */
public class Idade {
    public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);
     
     int ano,mes,dias,calculoAno,calculoMes,calculoFinal;
     
     System.out.println("=============>>Idade<<============= \n");
     
     System.out.print("Digite quantos anos você tem: ");
     ano = teclado.nextInt();
     System.out.println("-----------------------------------------------------------------");
     
     System.out.print("Digite quantos meses se passaram depois do seu último aniversário: ");
     mes = teclado.nextInt();
     System.out.println("-----------------------------------------------------------------");
     
     System.out.print("Digite quantos dias faltam ou quantos dias se passaram até seu aniversário:");
     dias = teclado.nextInt();
     System.out.println("-----------------------------------------------------------------");
     
     
     calculoAno = ano*365;
     calculoMes = mes*30;
     calculoFinal = calculoAno+calculoMes+dias;
     
     
     System.out.print("Você tem " +calculoFinal+ " dias de vida ");
     
     
     
        
        
    }
}

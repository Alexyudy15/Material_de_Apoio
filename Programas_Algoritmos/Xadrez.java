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
 * Exercício 8
 * Jogo de Xadrez
 */
public class Xadrez {
    public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);
     
     int horaInicio,horaFim,diaInicio,diaFim,calculo1,calculo2;
     
     System.out.println("=============>>Xadrez<<============= \n");
     
     System.out.print("Digite a hora que começou a partida: ");
     horaInicio = teclado.nextInt();
     System.out.print("Digite o dia que começou a partida: ");
     diaInicio = teclado.nextInt();
     System.out.print("Digite a hora que terminou a partida: ");
     horaFim = teclado.nextInt();
     System.out.print("Digite o dia que terminou a partida: ");
     diaFim = teclado.nextInt();
     
  if(diaInicio > 24){
      System.out.println("Maior que 24 horas! Tempo limite");
     if(diaInicio != diaFim){
     calculo1 = horaInicio-24-horaFim;
     System.out.print("Foram gastos nesse jogo " + calculo1 + " horas");
     }
     else if(diaInicio == diaFim){
         calculo2 = horaInicio-horaFim;
         System.out.print("Foram gastos nesse jogo " + calculo2 + " horas");
     }
     else{
         System.out.print("Valor desconhecido");
     }

  }
  
        
    }
}

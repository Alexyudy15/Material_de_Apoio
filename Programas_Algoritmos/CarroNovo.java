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
 * Exercício 4
 */
public class CarroNovo {
    public static void main(String[] args){
     Scanner teclado = new Scanner(System.in);
     Float carroFabrica,distribuidor,impostos,descontos,valorFinal;
     
      System.out.println("=============>>Compra de Carros<<============= \n");
     
      System.out.print("Digite o valor do carro de fábrica: ");
     carroFabrica = teclado.nextFloat();
     System.out.println("--------------------------------------------");
     
     distribuidor = (carroFabrica*28)/100;
     impostos = (carroFabrica*45)/100;
     descontos = distribuidor+impostos;
     
     valorFinal = carroFabrica+descontos;
     System.out.printf("O custo final do consumidor é de: R$ %.2f \n", valorFinal);
     
     System.out.println("--------------------------------------------");
     System.out.println("Sendo cobrado R$ "+distribuidor+" pelo distribuidor " );
     System.out.println("E R$ "+impostos+" de impostos" );
     
     
     
     
        
    }
}

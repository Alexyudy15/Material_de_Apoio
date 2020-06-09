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
 * Exercício 3
 * Calculo Raio
 */
public class Raio {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159 , raio, volume;

        System.out.println("=============>>Xadrez<<============= \n"); 
        
        System.out.print("Digite o volume do Raio: ");
        raio = teclado.nextDouble();

        volume = (4/3) * pi * Math.pow(raio,3);

        System.out.printf("VOLUME DO RAIO = %.2f \n",volume);
       
    }
}

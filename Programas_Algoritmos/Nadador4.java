/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AvaliacaoAlexandre;

import java.util.Scanner;

/**
 *
 * @author Alex Yudy Kitahara
 * 
 * 4. (1,0) Criar um programa que leia a idade de um nadador e apresente a sua categoria de acordo com a tabela abaixo:

 */
public class Nadador4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("=============Nadador================ \n");
               
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        
        System.out.print("========================================= \n");
        
        System.out.print("Digite sua idade: ");
        idade = teclado.nextInt();

        
        switch (idade){
    case 5:
    case 6:
    case 7:
            System.out.print("========================================= \n");
            System.out.println(nome + ", Você faz parte da categoria Infantil A");
    break;
    case 8:
    case 9:
    case 10: 
        System.out.print("========================================= \n");
        System.out.println(nome + ", Você faz parte da categoria Infantil B");
    break;
    case 11:
    case 12:
    case 13:
        System.out.print("========================================= \n");
        System.out.println(nome + ", Você faz parte da categoria Juvenil A");
    break;
    case 14:
    case 15:
    case 16:
    case 17:
        System.out.print("========================================= \n");
        System.out.println(nome + ", Você faz parte da categoria Juvenil B");
    break;
   default:
       if(idade >= 18){
        System.out.print("========================================= \n");
        System.out.println(nome + ", Você faz parte da categoria Adulto"); 
       }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        }
        
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suporte;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class CaminhoMinado {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
    int bombas,resposta,casas;
     
    
    System.out.print("Digite o número de casas desejadas: ");
    casas = teclado.nextInt();
    
    int vetor [] = new int[casas];
    
    
    System.out.print("Digite o número de bombas desejadas: ");
    bombas = teclado.nextInt();
    
   
        if(bombas<= 0 && casas<=1 ){
            System.out.print("Valores incorretos, tente novamente mais tarde!");
            
        }
        else{
            System.out.print("O jogo vai começar");
        }
        
        
       
        
         
        
        
            
        
         
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    switch(casas){
    case 1:
    break;
    case 2:
    break;
    case 3:
    break;
    case 4:
    break;
    case 5:
    break;
    case 6:
    break;
    case 7:
    break;
    default:
    
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}

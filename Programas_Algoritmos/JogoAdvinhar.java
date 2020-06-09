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
 * @author Alex Yudy Kitahara
 * Jogo de Adivinhar Números
 */
public class JogoAdvinhar {
    
    public static void ajuda(int escolha, int numeroAleatorio, int tentativas ){
        if(escolha > numeroAleatorio){
            System.out.println("Errou! Seu palpite é maior que o número sorteado.");
        } 
        else{
            if(escolha < numeroAleatorio){
                    System.out.println("Errou! Seu palpite é menor que o número sorteado.");
            }
            else {
                System.out.println("Parabéns, você ganhou o jogo! O número era " + numeroAleatorio);
                System.out.println("Você tentou " + tentativas + " vezes antes de acertar!");
                
            }
        }
            
    }
   
    
 public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        
        int escolha=0,numeroaAeatorio,tentativas=5;
        String nome;
        int numeroAleatorio = aleatorio.nextInt(100);
        
        System.out.println("========== Jogo de Adivinhar Números ==========\n");
        
        System.out.print("Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Bem vindo " + nome + " vamos tentar advinhar o número? ");

        System.out.println("O número sorteado é 'XX'. Boa sorte! ");
        do{                      
            System.out.printf("\n======================================\n");
            System.out.println("Chances: " + tentativas);
            System.out.print("Tente advinhar o número: ");
            escolha = teclado.nextInt();
            
            tentativas--;
            
        if(escolha == numeroAleatorio+1){
            System.out.println("TÁ QUENTE!!!");
        }
        else if(escolha == numeroAleatorio-1){
            System.out.println("TÁ QUENTE!!!");
        }
            
           ajuda(escolha,numeroAleatorio, tentativas);
        }while (escolha != numeroAleatorio && tentativas >= 1);
        System.out.printf("\n\n");
        
        
        if(tentativas < 1){
            System.out.println("Game Over! O número era sorteado era " + numeroAleatorio);
            
        }
         
    }
    
    
}

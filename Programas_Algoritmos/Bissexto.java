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
public class Bissexto {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int ano;
        System.out.println("==================* Ano bissexto *==================");
        System.out.print("Digite o Ano para verificar se é bissexto ou não: ");
        ano = teclado.nextInt();
        
        if((ano % 4 == 0)&&(ano % 100 !=0) ||(ano % 400 ==0)){
            System.out.println("");
            System.out.println("O ano de: " + ano + " é bissexto ");
        }
        else{
            System.out.println("");
            System.out.println("O ano de: " + ano + " não é bissexto ");
        
        }
    }
    
}

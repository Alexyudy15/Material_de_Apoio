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
public class Desconto {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    float peca,desconto1,desconto2,valorFinal;
    
    System.out.println("==================* Desconto *==================");
    System.out.print("Digite o valor da sua peça: ");
    peca = teclado.nextFloat();
    
    if(peca>=300){
        desconto1 =(peca*20)/100;
        valorFinal = peca+desconto1;
        
        System.out.printf("Desconto de: R$ %.2f", desconto1);
        System.out.println("");
        System.out.println("==========================================");
        System.out.printf("Valor do Produto com Desconto: R$ %.2f",valorFinal);
    }
    else{
        desconto2 =(peca*15)/100;
        valorFinal = peca+desconto2;
        
        System.out.printf("Desconto de: R$ %.2f " , desconto2);
        System.out.println("==========================================");
        System.out.println("");
        System.out.printf("Valor do Produto com Desconto: R$ %.2f",valorFinal);
    
    }
    }
    
}

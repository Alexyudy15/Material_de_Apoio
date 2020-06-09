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
 * 1. (1,0) Criar um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele
no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, calcular e
imprimir o total a receber no final do mês.
 */
public class SalarioVendedor1 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String vendedor;
        Float salariofixo,vendas,comissao,result;
        
        System.out.println("=============Salário Vendas================ \n");
        
        System.out.print("Digite seu nome: ");
        vendedor = teclado.nextLine();
        
        System.out.print("========================================= \n");
        
        System.out.print("Digite seu salário fixo em R$: ");
        salariofixo = teclado.nextFloat();
        
        System.out.print("========================================= \n");
        
        System.out.print("Digite o valor total de vendas no mês em R$: ");
        vendas = teclado.nextFloat();
        
        System.out.print("========================================= \n");
        
        comissao = (vendas*15)/100;
        result = salariofixo+comissao;
        
        System.out.printf(vendedor + ", Você irá receber: R$ %.2f \n ", result);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

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
 * Exercício 5
 * Desconto funcionario
 */
public class DescontoFuncionario {
    public static void main(String[] args){
    Double salarioBruto,salarioLiquido,inss,ir,descontos,proventos,bonus;
    
    Scanner teclado = new Scanner(System.in);
        
      System.out.println("=============>>Desconto Funcionarios<<============= \n");
      System.out.print("Digite seu salário Bruto: ");
      salarioBruto = teclado.nextDouble();
      
      inss =(salarioBruto*8)/100;
      ir = (salarioBruto*15)/100;
      descontos = inss+ir;
      
      salarioLiquido = salarioBruto-descontos;
      System.out.printf("Salario Bruto é: R$ %.2f \n ", salarioBruto);
      System.out.println("--------------------------------------------");
      System.out.printf("Salario Liquido: R$ %.2f \n ", salarioLiquido);
      System.out.println("--------------------------------------------");
      proventos =(salarioLiquido*5.75)/100;
      bonus = salarioLiquido+proventos;
      System.out.printf("O Salário liquido com Bônus é: R$ %.2f \n",bonus);
      
    
    }
}

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
public class Enunciado {
    public static void main(String[] args){
Scanner teclado = new Scanner(System.in);

String pergunta;

System.out.println(" Se um carro está em uma avenida movimentada por pedestres, e há placas dizendo que o limite de velocidade é 40km. Tem um radar que foi desenvolvido com a \n seguinte instrução: carroVelocidade > 40. ual é a ação que o sistema irá imprimir? Digite escolha as opções. \n");

System.out.println("<A>: Dar um prêmio ao motorista");
System.out.println("<B>: Recolher o carro do motorista");
System.out.println("<C>: Multar o motorista e dar 3 pontos na carteira");
System.out.println("<D>: Processar o Motorista");
System.out.println("<E>: Dar 7 pontos na carteira do motorista \n");

System.out.print("RESPOSTA:");
pergunta = teclado.next();



switch(pergunta){
    case "a":
    case "A":    
    System.out.println("ERRADO");
    break;
    case "b":
    case "B":
    System.out.println("ERRADO");
    break;
    case "c":
    case "C":
    System.out.println("CERTO");
    break;
    case "d":
    case "D":
    System.out.println("ERRADO");
    break;
    case "e":
    case "E":
    System.out.println("ERRADO");
    break;
    default:
    System.out.println("VALOR INCORRETO");
    break;
  
}
}
    
}

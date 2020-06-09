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
 * 7. (1,0) Em uma eleição presidencial existem quatro candidatos. Os votos são informados por código. Os dados
utilizados para a apuração obedecem à seguinte codificação:
• 1, 2, 3, 4 = voto para os respectivos candidatos;
• 5 = voto nulo;
• 6 = voto em branco.
Criar um programa que calcule e apresente:
• o total de votos para cada candidato e seu porcentual sobre o total;
• o total de votos nulos e seu porcentual sobre o total;
• o total de votos em branco e seu porcentual sobre o total.
Como finalizador do conjunto de votos, tem-se o valor 0.
 */
public class eleicao7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        int candidato1=0,candidato2=0,candidato3=0,candidato4=0,nulo5=0,branco6=0,voto,sair=0,resultTotal;
        
        System.out.println("=============Eleições================ \n");
        
        System.out.println("*****************OPÇÕES****************** \n");
        System.out.println("0 - Sair");
        System.out.println("1 - candidato 1");
        System.out.println("2 - candidato 2");
        System.out.println("3 - candidato 3");
        System.out.println("4 - candidato 4");
        System.out.println("5 - Nulo");
        System.out.println("6 - Branco \n");
        System.out.print("========================================= \n");
        
        
        do{
        System.out.print("Digite seu voto: ");
        voto = teclado.nextInt();
        switch(voto){
            case 0:
                if(voto == 0){
                sair = voto;
                resultTotal=candidato1+candidato2+candidato3+candidato4+nulo5+branco6;
                System.out.println("Total de votos do candidato 1 e seu porcentual sobre o total: "+"Nº de votos: " + candidato1 +" || Porcentual: " + (candidato1*100)/resultTotal +"%");
                System.out.println("Total de votos do candidato 2 e seu porcentual sobre o total: "+"Nº de votos: " + candidato2 +" || Porcentual: " + (candidato2*100)/resultTotal + "%");
                System.out.println("Total de votos do candidato 3 e seu porcentual sobre o total: "+"Nº de votos: " + candidato3 +" || Porcentual: " + (candidato3*100)/resultTotal +"%");
                System.out.println("Total de votos do candidato 3 e seu porcentual sobre o total: "+"Nº de votos: " + candidato4 +" || Porcentual: " + (candidato4*100)/resultTotal +"%");
                System.out.println("Total de votos nulos e seu porcentual sobre o total: "+"Nº de votos: " + nulo5 +" || Porcentual: " + (nulo5*100)/resultTotal +"%");
                System.out.println("Total de votos em branco e seu porcentual sobre o total: "+"Nº de votos: " + branco6 +" || Porcentual: "+ (branco6*100)/resultTotal +"%");    
            }
                break;
            case 1:
                if(voto == 1){
                
                System.out.println("Voto em Candidato 1 com sucesso! ");
                System.out.print("========================================= \n");
                System.out.println("*****************OPÇÕES****************** \n");
                System.out.println("0 - Sair");
                System.out.println("1 - candidato 1");
                System.out.println("2 - candidato 2");
                System.out.println("3 - candidato 3");
                System.out.println("4 - candidato 4");
                System.out.println("5 - Nulo");
                System.out.println("6 - Branco \n");
                System.out.print("========================================= \n");
                candidato1++;

            }
                break;
            case 2:
                if(voto == 2){
                System.out.println("Voto em Candidato 2 com sucesso! ");
                System.out.print("========================================= \n");
                System.out.println("*****************OPÇÕES****************** \n");
                System.out.println("0 - Sair");
                System.out.println("1 - candidato 1");
                System.out.println("2 - candidato 2");
                System.out.println("3 - candidato 3");
                System.out.println("4 - candidato 4");
                System.out.println("5 - Nulo");
                System.out.println("6 - Branco \n");
                System.out.print("========================================= \n");
                candidato2++;
            }

                break;
            case 3:
                if(voto == 3){  
                System.out.println("Voto em Candidato 3 com sucesso! ");
                System.out.print("========================================= \n");
                System.out.println("*****************OPÇÕES****************** \n");
                System.out.println("0 - Sair");
                System.out.println("1 - candidato 1");
                System.out.println("2 - candidato 2");
                System.out.println("3 - candidato 3");
                System.out.println("4 - candidato 4");
                System.out.println("5 - Nulo");
                System.out.println("6 - Branco \n");
                System.out.print("========================================= \n");
                candidato3++;
            }
                break;
            case 4:
                if(voto == 4){
                System.out.println("Voto em Candidato 4 com sucesso! ");
                System.out.print("========================================= \n");
                System.out.println("*****************OPÇÕES****************** \n");
                System.out.println("0 - Sair");
                System.out.println("1 - candidato 1");
                System.out.println("2 - candidato 2");
                System.out.println("3 - candidato 3");
                System.out.println("4 - candidato 4");
                System.out.println("5 - Nulo");
                System.out.println("6 - Branco \n");
                System.out.print("========================================= \n");
                candidato4++;
            
            }
                break;
            case 5:
                if(voto == 5){
                System.out.println("Voto anulado com sucesso! ");
                System.out.print("========================================= \n");
                System.out.println("*****************OPÇÕES****************** \n");
                System.out.println("0 - Sair");
                System.out.println("1 - candidato 1");
                System.out.println("2 - candidato 2");
                System.out.println("3 - candidato 3");
                System.out.println("4 - candidato 4");
                System.out.println("5 - Nulo");
                System.out.println("6 - Branco \n");
                System.out.print("========================================= \n");
                nulo5++;
            
            }
                break;
            case 6:
                if(voto == 6 ){
                System.out.println("Voto branco realizado com sucesso! ");
                System.out.print("========================================= \n");
                System.out.println("*****************OPÇÕES****************** \n");
                System.out.println("0 - Sair");
                System.out.println("1 - candidato 1");
                System.out.println("2 - candidato 2");
                System.out.println("3 - candidato 3");
                System.out.println("4 - candidato 4");
                System.out.println("5 - Nulo");
                System.out.println("6 - Branco \n");
                System.out.print("========================================= \n");
                branco6++;
            }
                break;
            default:
                System.out.println("Opção incorreta");
                System.out.print("========================================= \n");
                System.out.println("*****************OPÇÕES****************** \n");
                System.out.println("0 - Sair");
                System.out.println("1 - candidato 1");
                System.out.println("2 - candidato 2");
                System.out.println("3 - candidato 3");
                System.out.println("4 - candidato 4");
                System.out.println("5 - Nulo");
                System.out.println("6 - Branco \n");
                System.out.print("========================================= \n");
                break;
        }
        }while(voto != 0);
        


        
    }
}
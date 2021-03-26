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
 * 
 * Criar um programa para o gerenciamento de uma lista de nomes. Os nomes devem ser armazenados em um vetor do
    tipo String de tamanho 50. O programa deve possuir o seguinte menu:
   
1 - Adicionar um novo nome
2 - Apresentar os nomes
3 - Pesquisar um nome
4 - Remover um nome
0 - Sair

 */
public class Avaliacao2{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String nome,procurar,excluir;
        String[] lista = new String[50];
        int opcao;
        
        System.out.println("=============Lista de convidados================ \n");
    
        do{
        System.out.println("================ Menu ================ "); 
        System.out.println("1 - Adicionar um novo nome");
        System.out.println("2 - Apresentar os nomes");
        System.out.println("3 - Pesquisar um nome");
        System.out.println("4 - Remover um nome");
        System.out.println("0 - Sair");
        System.out.println("==================================== ");
        
         System.out.print("Digite a opção desejada: ");
         opcao = teclado.nextInt();
         System.out.println("");
         if(opcao == 1){
             System.out.println("================ Adicionar nomes ================ "); 
                    System.out.print("Digite um nome para ser adicionado: ");
                    nome = teclado.next();
                    System.out.println("\n********************************* ");
             for(int i =0; i<lista.length; i++){
               if(i > 50){
                  System.out.print("Não é possivel adicionar pois a lista está cheia! ");
                  break;
               }
               else{
               if(lista[i] == null){
                  lista[i] = nome; 
                   System.out.println("Nome Adicionado com sucesso! ");
                   System.out.println("*********************************  \n");
                   break;
               }
               else if(nome.equals(lista[i])){
                   System.out.println("Não é possivel adicionar pois o nome já existe na lista! ");
                   System.out.println("*********************************  \n");
                   break;
                }
              }
            }
          }
           if(opcao == 2){
               System.out.println("================ Nomes na lista================ "); 
               for(int i =0; i<lista.length; i++){
                   if(lista[i] == null){
                       System.out.println("\n********************************* ");
                       System.out.println("A lista está vazia! ");
                       System.out.println("********************************* \n");
                       break;
                   }else{
                       System.out.println("\n********************************* ");
                       mostrarNomes(lista);
                       System.out.println("********************************* \n");
                       break;
                   }
               }
           }
           
           if(opcao == 3){
               System.out.println("================ Procurar nomes ================ "); 
               System.out.print("Digite um nome para procurar na lista: ");
                procurar = teclado.next();
                System.out.println("\n*********************************");
                
                for(int i = 0; i < lista.length; i++){
                if(lista[i].equals(procurar)){
                System.out.println("O nome foi localizado na lista: " + procurar);
                System.out.println("A posição de "+ procurar+ " é : " + i);
                System.out.println("********************************* \n");
                break;
                }
                else if(i == lista.length-1){
                System.out.println("Nome não encontrado na lista");
                System.out.println("********************************* \n");
                
            }
        }
           }
           
           if(opcao ==4){
               System.out.println("================ Excluir nomes ================ "); 
               System.out.print("Digite um nome para excluir da lista: ");
                excluir = teclado.next();
                System.out.println("\n*********************************");
                
                for(int i = 0; i != lista.length; i++){
                if(lista[i].equals(excluir)){
                lista[i]=null;
                System.out.println("O nome " +excluir+ " foi excluido!");
                System.out.println("********************************* \n");
                break;
                }
                else if(i == lista.length-1){
                System.out.println("Nome não encontrado na lista");
                System.out.println("********************************* \n");
                
            }
        }
           
     }

        }while(opcao != 0);
      
    }
   static void mostrarNomes(String[] Nomes){
       for(int j =0; j<Nomes.length; j++){
                   if(Nomes[j] != null){
                   System.out.println(Nomes[j]);
                   }
                   
               }
   } 
}
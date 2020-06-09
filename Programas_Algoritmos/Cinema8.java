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
 * 8. (2,0) Um cinema possui capacidade de 20 lugares e está sempre com ocupação total. Certo dia, cada espectador
respondeu a um questionário, na qual constava:
* 
* • sua idade;
  • sua opinião em relação ao filme, segundo as seguintes notas:
  * 
  * Criar um programa que, lendo estes dados, calcule e apresente:
  •    a quantidade de respostas Ótimo;
  •    a média de idade das pessoas que responderam Ruim;
  •    a porcentagem de respostas Péssimo e a maior idade que utilizou esta opção;
  •    a diferença de idade entre a maior idade que respondeu Ótimo e a maior idade que respondeu Ruim
 */
public class Cinema8 {    
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    
       int p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20;
       String nota1,nota2,nota3,nota4,nota5,nota6,nota7,nota8,nota9,nota10,nota11,nota12,nota13,nota14,nota15,nota16,nota17,nota18,nota19,nota20;
       int comecar,sair;
       

       System.out.println("=============Pesquisa do Cinema================ \n");
       
       System.out.println("Bem vindo! Essa é uma pesquisa para saber sua opinião em relação ao filme");

       

       
       System.out.print("========================================= \n");

       do{
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");        
           
                   System.out.println("Poltrona 1");
                   System.out.print("Digite sua idade: ");
                   p1 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota1 = teclado.next();
                   System.out.print("========================================= \n");
                                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 2");
                   System.out.print("Digite sua idade: ");
                   p2 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota2 = teclado.next();
                   System.out.print("========================================= \n");
             
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 3");
                   System.out.print("Digite sua idade: ");
                   p3 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota3 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
          
                   System.out.println("Poltrona 4");
                   System.out.print("Digite sua idade: ");
                   p4 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota4 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 5");
                   System.out.print("Digite sua idade: ");
                   p5 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota5 = teclado.next();
                   System.out.print("========================================= \n");
          
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 6");
                   System.out.print("Digite sua idade: ");
                   p6 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota6 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 7");
                   System.out.print("Digite sua idade: ");
                   p7 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota7 = teclado.next();
                   System.out.print("========================================= \n");
          
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 8");
                   System.out.print("Digite sua idade: ");
                   p8 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota8 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 9");
                   System.out.print("Digite sua idade: ");
                   p9 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota9 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
          
                   System.out.println("Poltrona 10");
                   System.out.print("Digite sua idade: ");
                   p10 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota10 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 11");
                   System.out.print("Digite sua idade: ");
                   p11 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota11 = teclado.next();
                   System.out.print("========================================= \n");
          
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 12");
                   System.out.print("Digite sua idade: ");
                   p12 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota12 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 13");
                   System.out.print("Digite sua idade: ");
                   p13 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota13 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
          
                   System.out.println("Poltrona 14");
                   System.out.print("Digite sua idade: ");
                   p14 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota14 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 15");
                   System.out.print("Digite sua idade: ");
                   p15 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota15 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
          
                   System.out.println("Poltrona 16");
                   System.out.print("Digite sua idade: ");
                   p16 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota16 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 17");
                   System.out.print("Digite sua idade: ");
                   p17 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota17 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
          
                   System.out.println("Poltrona 18");
                   System.out.print("Digite sua idade: ");
                   p18 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota18 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
                   
                   System.out.println("Poltrona 19");
                   System.out.print("Digite sua idade: ");
                   p19 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota19 = teclado.next();
                   System.out.print("========================================= \n");
                   
                   System.out.println("a - ÓTIMO");
                   System.out.println("b - BOM");
                   System.out.println("c - REGULAR");
                   System.out.println("d - RUIM");
                   System.out.println("e - PÉSSIMO");
                   System.out.println("*************************************** ");
          
                   System.out.println("Poltrona 20");
                   System.out.print("Digite sua idade: ");
                   p20 = teclado.nextInt();
                   System.out.print("Digite sua nota: ");
                   System.out.print("");
                   nota20 = teclado.next();
                   System.out.print("========================================= \n");  
              
        
   //////////////////////////a quantidade de respostas Ótimo/////////////////////////////////////////////////////
                int a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0,a10=0,a11=0,a12=0,a13=0,a14=0,a15=0,a16=0,a17=0,a18=0,a19=0,a20=0;
                int z1=0,z2=0,z3=0,z4=0,z5=0,z6=0,z7=0,z8=0,z9=0,z10=0,z11=0,z12=0,z13=0,z14=0,z15=0,z16=0,z17=0,z18=0,z19=0,z20=0;
                        
              
                   String aa = "a";
                   int cont = 0;
                      if(aa.equals(nota1)){
                          cont++;
                          a1 = p1;
                        }
                      if(aa.equals(nota2)){
                          cont++;
                          a2 = p2;
                        }
                      if(aa.equals(nota3)){
                          cont++;
                          a3 = p3;
                        }
                      if(aa.equals(nota4)){
                          cont++;
                          a4 = p4;
                        }
                      if(aa.equals(nota5)){
                          cont++;
                          a5 = p5;
                        }
                      if(aa.equals(nota6)){
                          cont++;
                          a6 = p6;
                        }
                      if(aa.equals(nota7)){
                          cont++;
                          a7 = p7;
                        }
                      if(aa.equals(nota8)){
                          cont++;
                          a8 = p8;
                        }
                      if(aa.equals(nota9)){
                          cont++;
                          a9 = p9;
                        }
                      if(aa.equals(nota10)){
                          cont++;
                          a10 = p10;
                        }
                      if(aa.equals(nota11)){
                          cont++;
                          a11 = p11;
                        }
                       if(aa.equals(nota12)){
                          cont++;
                          a12 = p12;
                        }
                      if(aa.equals(nota13)){
                          cont++;
                          a13 = p13;
                        }
                      if(aa.equals(nota14)){
                          cont++;
                          a14 = p14;
                        }
                      if(aa.equals(nota15)){
                          cont++;
                          a15 = p15;
                        }
                      if(aa.equals(nota16)){
                          cont++;
                          a16 = p16;
                        }
                      if(aa.equals(nota17)){
                          cont++;
                          a17 = p17;
                        }
                      if(aa.equals(nota18)){
                          cont++;
                          a18 = p18;
                        }
                      if(aa.equals(nota19)){
                          cont++;
                          a19 = p19;
                        }
                      if(aa.equals(nota20)){
                          cont++;
                          a20 = p20;
                        }
                      
 ///////////////////////////////a média de idade das pessoas que responderam Ruim;////////////////////////////////////////////////////////////////////////       

                   String dd = "d";
                   int pessoasRuim= 0;
                   int calculo = 0;
                   
                      if(dd.equals(nota1)){
                           pessoasRuim++;
                           calculo = p1 + calculo;
                           z1 = p1;
                           
                        }
                      if(dd.equals(nota2)){
                           pessoasRuim++;
                           calculo = p2 + calculo;
                           z2 = p2;

                        }
                      if(dd.equals(nota3)){
                          pessoasRuim++;
                          calculo = p3 + calculo;
                          z3 = p3;
                          
                        }
                      if(dd.equals(nota4)){
                          pessoasRuim++;
                          calculo = p4 + calculo;;
                          z4 = p4;
                        }
                      if(dd.equals(nota5)){
                          pessoasRuim++;
                          calculo = p5 + calculo;
                          z5 = p5;
                        }
                      if(dd.equals(nota6)){
                          pessoasRuim++;
                          calculo = p6 + calculo;
                          z6 = p6;
                        }
                      if(dd.equals(nota7)){
                          pessoasRuim++;
                          calculo = p7 + calculo;
                          z7 = p7;
                        }
                      if(dd.equals(nota8)){
                          pessoasRuim++;
                          calculo = p8 + calculo;
                          z8 = p8;
                        }
                      if(dd.equals(nota9)){
                          pessoasRuim++;
                          calculo = p9 + calculo;
                          z9 = p9;
                        }
                      if(dd.equals(nota10)){
                          pessoasRuim++;
                          calculo = p10 + calculo;
                          z10 = p10;
                        }
                      if(dd.equals(nota11)){
                          pessoasRuim++;
                          calculo = p11 + calculo;
                          z11 = p11;
                        }
                       if(dd.equals(nota12)){
                          pessoasRuim++;
                          calculo = p12 + calculo;
                          z12 = p12;
                        }
                      if(dd.equals(nota13)){
                          pessoasRuim++;
                          calculo = p13 + calculo;
                          z13 = p13;
                        }
                      if(dd.equals(nota14)){
                          pessoasRuim++;
                          calculo = p14 + calculo;
                          z14 = p14;
                        }
                      if(dd.equals(nota15)){
                          pessoasRuim++;
                          calculo = p15 + calculo;
                          z15 = p15;
                        }
                      if(dd.equals(nota16)){
                         pessoasRuim++;
                          calculo = p16 + calculo;
                          z16 = p16;
                        }
                      if(dd.equals(nota17)){
                          pessoasRuim++;
                          calculo = p17 + calculo;
                          z17 = p17;
                        }
                      if(dd.equals(nota18)){
                          pessoasRuim++;
                          calculo = p18 + calculo;
                          z18 = p18;
                        }
                      if(dd.equals(nota19)){
                          pessoasRuim++;
                          calculo = p19 + calculo;
                          z19 = p19;
                        }
                      if(dd.equals(nota20)){
                          pessoasRuim++;
                          calculo = p20 + calculo;
                          z20 = p20;
                        }
                      
 
//////////////////////////// a porcentagem de respostas Péssimo//////////////////////////////////////////////////////////////////////////////////////
                    int r1=0,r2=0,r3=0,r4=0,r5=0,r6=0,r7=0,r8=0,r9=0,r10=0,r11=0,r12=0,r13=0,r14=0,r15=0,r16=0,r17=0,r18=0,r19=0,r20=0;      
                    String ee = "e";
                    int contE = 0;
                    int totalVotos =20;
                   
                      if(ee.equals(nota1)){
                          contE++;
                          r1 = p1;
      
                        }
                      if(ee.equals(nota2)){
                          contE++;
                          r2 = p2;

                        }
                     if(ee.equals(nota3)){
                          contE++;
                          r3 = p3;
                        }
                      if(ee.equals(nota4)){
                          contE++;
                          r4 = p4;
                        }
                      if(ee.equals(nota5)){
                          contE++;
                          r5 = p5;
                        }
                      if(ee.equals(nota6)){
                          contE++;
                          r6 = p6;
                        }
                      if(ee.equals(nota7)){
                          contE++;
                          r7 = p7;
                        }
                      if(ee.equals(nota8)){
                          contE++;
                          r8 = p8;
                        }
                      if(ee.equals(nota9)){
                          contE++;
                          r9 = p9;
                        }
                      if(ee.equals(nota10)){
                          contE++;
                          r10 = p10;
                        }
                      if(ee.equals(nota11)){
                          contE++;
                          r11 = p11;
                        }
                       if(ee.equals(nota12)){
                          contE++;
                          r12 = p12;
                        }
                      if(ee.equals(nota13)){
                          contE++;
                          r13 = p13;
                        }
                      if(ee.equals(nota14)){
                          contE++;
                          r14 = p14;
                        }
                      if(ee.equals(nota15)){
                          contE++;
                          r15 = p15;
                        }
                      if(ee.equals(nota16)){
                          contE++;
                          r16 = p16;
                        }
                      if(ee.equals(nota17)){
                          contE++;
                          r17 = p17;
                        }
                      if(ee.equals(nota18)){
                          contE++;
                          r18 = p18;
                        }
                      if(ee.equals(nota19)){
                          contE++;
                          r19 = p19;
                        }
                      if(ee.equals(nota20)){
                          contE++;
                          r20 = p20;
                          
                        }
                     
   /////////////////////////maior idade que utilizou esta opção pessimo////////////////////////////////////

                     
                     int[] MaiorPessimo = {r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20};
          
                     int max = MaiorPessimo[0];
                      for (int i = 1; i < MaiorPessimo.length; i++) {
                            if (MaiorPessimo[i] > max) 
                                max = MaiorPessimo[i];
                        }

                     
  //////////////a diferença de idade entre a maior idade que respondeu Ótimo e a maior idade que respondeu Ruim.////////////// 
  
                    int[] MaiorOtimo = {a1,a2,a3,a4,a5,a6,r7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20};
          
                     int maiorOt = MaiorOtimo[0];
                      for (int i = 1; i < MaiorOtimo.length; i++) {
                            if (MaiorOtimo[i] > maiorOt) 
                                maiorOt = MaiorOtimo[i];
                        }
                      
                      int[] MaiorRuim = {z1,z2,z3,z4,z5,z6,z7,z8,z9,z10,z11,z12,z13,z14,z15,z16,z17,z18,z19,z20};
          
                     int maiorRui = MaiorRuim[0];
                      for (int i = 1; i < MaiorRuim.length; i++) {
                            if (MaiorRuim[i] > maiorRui) 
                                maiorRui = MaiorRuim[i];
                        }
                      
                      int diferenca = 0;
                      if(maiorOt > maiorRui){
                           diferenca = maiorOt -maiorRui;
                    }
                      else if(maiorRui > maiorOt){
                          diferenca = maiorRui - maiorOt;
                      }
                      
                      
  ////////////////////////////////resultados///////////////////////////////////////////////////////////////////////                    
  
  

        System.out.println("Quantidade de Respostas Ótimas: " + cont);
        System.out.println("Média de idade das pessoas que responderam ruim: " + (calculo / pessoasRuim + " anos"));
        System.out.println("Porcentagem de respostas Péssimo: " + (contE*100)/totalVotos + "%");
        System.out.println("Maior idade que utilizou Péssimo: " + max + " anos");
        System.out.println("Diferença de idade entre a maior idade que respondeu Ótimo e a maior idade que respondeu Ruim: " + diferenca + " anos");
        System.out.print("========================================= \n");
        System.out.println("Deseja Sair? Pressione 0 ");
        sair = teclado.nextInt();
       }while(sair != 0);
       
        
}
    
}

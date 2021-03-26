/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosII;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Testando {

     public static void main(String args[]) throws IOException {
        Scanner entrada=new Scanner(System.in);
        
        //chamada de avisos
        avisos();
        
        //MENSAGEM INICIAL
        System.out.println("\n\n\nPodemos Prosseguir?");
        String resposta=entrada.next();
        System.out.println("\n\n\nListagem das Palavras\n\n");
        
        if("Sim".equalsIgnoreCase(resposta)){
            //VAR---------------------------------------------------------------
           
            FileReader arquivo;
            BufferedReader leBuff;
            arquivo = new FileReader("dicionario.txt");
            leBuff = new BufferedReader(arquivo);
            
            //Declarando Vetor
            String[] vetor = new String[1000];
            
            while (true) {
                //Var de Leitura
                String palavras = leBuff.readLine();
                
                //2ªCondição
                if (palavras.equals("")) {
                    continue;
                }
                
                //3ªCondição
                if (palavras.equals(".")) {
                    break;
                }
                
                String[] vetString = palavras.trim().split(" ",1000);
                //PRE-LISTA O COM OS ESPAÇOS
                for (int i = 0; i < vetString.length; i++){
                    int resultado=buscaBinaria(vetString);
                    if(resultado==0){
                        vetString[i]="";
                    }
                    else{
                        vetor[i] = vetString[i];  
                        System.out.println("["+vetor[i]+"]");
                    }
                }        
        }
            //final leitura do arquivo
            leBuff.close();
            
            
            //CHAMAR ORDENAÇÃO ALFABETICA POR INSERCAO
            
            //Imprimi total de palavras
            System.out.println("Total de Palavras lidas: "+contadorPalavras(vetor));
        }
        else{
            System.out.println("Aguardo você revisar seu documento :)");
        }
        
    }
    public static void avisos(){
        System.out.println("AVISOS IMPORTANTES////////////////////");
        System.out.println("-O arquivo text não pode haver vírgulas (,) e nem"
                + "\nparavras com acentos.");
        System.out.println("-Este Programa lê aqruivos de até 1000 palavras");
        System.out.println("");
        
    }
    public static void impVetor( String vetorImp[] ){
        for(int i=0;i<vetorImp.length;i++){
            System.out.print(vetorImp[i]+"\n");
        }
    }
    public static int buscaBinaria(String[] vet){
        int inicio=0;
        int end= vet.length-1;
        int meio;
        
        //REALIZANDO TESTES COM A BUSCA BINÁRIA
        for(int i=0; i<vet.length-1; i++){
            for(int j=0; j<=vet.length-2; j++){
                int resulta=vet[j+1].compareToIgnoreCase(vet[j]);
                
                meio= (inicio+end)/2;
                
                if((resulta==0)){
                    return 0;
                }
                else if((resulta<0)){
                    end=meio-1;
                    
                }
                else{
                    end=meio+1;
                }
            }
        }  
        //Retorno se caso o elemento não esteja contido no 
        return -1; 
    }
    public static void OrdenaAlfa(String vetString[]){
        //ORDENANDO VETOR EM ORDEM ALFABETICA
        for (int i = 0; i < vetString.length - 1; i++) {
            for (int t = 0; t <= vetString.length - 2; t++){
                if ((vetString[t + 1].compareTo(vetString[t]) < 0)) {
                    String temp = vetString[t];
                    vetString[t] = vetString[t + 1];
                    vetString[t + 1] = temp;
                }
            }    
        }   
    }
    public static int contadorPalavras( String vet[]){
        //contador de palavras
        int ipalavras=0;
        
        //percorrer vetor()
        for (int i = 0; i < vet.length; i++){
            ipalavras++;
        }
        
        return ipalavras;
    }
}

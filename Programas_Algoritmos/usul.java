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

/*
Entrega do Trabalho 2- Algoritmos e Programação II
Nós,
Nome completo
Nome completo
declaramos que
todas as respostas são fruto de nosso próprio trabalho,
não copiamos respostas de colegas externos à equipe,
não disponibilizamos nossas respostas para colegas externos ao grupo e
não realizamos quaisquer outras atividades desonestas para nos beneficiar ou
prejudicar outros.
*/

/**
 Alex Yudy Kitahara 
 * Explicação: Não consegui realizar a busca binária e a exclusão de palavras repetidas
 * pois ficou muito dificil implementar ela junto com a ordenação
 * Também não consegui realizar a ordenação quando se trata de um arquivo com quebras de linha,
 * por exemplo, quando se trata de um arquivo txt com uma unica linha extensa ele consegue ordenar, mas quando 
 * ela tem quebras ele não ordena inteiro, ordena apenas linha por linha, espero que entenda e mesmo que não 
 * tenha conseguido realizar todos os detalher eu dei meu melhor e tentei sem parar.
 */
public class usul {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileReader arquivo;
        BufferedReader leBuff;
        String temp1 = null;
        String temp2 = null;
        arquivo = new FileReader("dicionario.txt");
        leBuff = new BufferedReader(arquivo);
        String[] vetor = new String[1000];

        while (true) {
            String palavras = leBuff.readLine();
            if (palavras.equals("")) {
                continue;
            }
            if (palavras == null) {
                break;
            }
            if (palavras.equals(".")) {
                break;
            }
            
            String vetString[] = palavras.split(" ");

            for (int i = 0; i < vetString.length - 1; i++) {
                for (int t = 0; t <= vetString.length - 2; t++) {

                    if ((vetString[t + 1].compareToIgnoreCase(vetString[t]) < 0)) {
                        String temp = vetString[t];
                        vetString[t] = vetString[t + 1];
                        vetString[t + 1] = temp;
                    }
                }
            }

            for (int i = 0; i < vetString.length; i++) {

                vetor[i] = vetString[i];
                System.out.println(vetor[i]);
            }
        }
        leBuff.close();
    }
    
}

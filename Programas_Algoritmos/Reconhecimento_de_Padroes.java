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
import java.util.*;

/**
 *
 * @author Alex Yudy Kitahara
 */
public class Reconhecimento_de_Padroes {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        int L, C;
        //lendo arquivo .txt
        FileReader arquivo;
        arquivo = new FileReader("entrada.txt");
        BufferedReader leBuff;
        leBuff = new BufferedReader(arquivo);

        System.out.println("=============Reconhecimento de Padrões=============");

        //lendo a linha e a coluna
        String linha1 = leBuff.readLine();
        L = Integer.parseInt(linha1);
        String linha2 = leBuff.readLine();
        C = Integer.parseInt(linha2);

        //criando a matriz
        float mat[][] = new float[L][C];
        System.out.println(linha1 + " " + linha2);

        // inserindo  valores do arquivo na matriz
        for (int i = 0; i < L; i++){
            String linha3 = leBuff.readLine();
            String vetString[] = linha3.split(" ");
            for (int j = 0; j < C; j++) {
                mat[i][j] = Float.parseFloat(vetString[j]);
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        //vetor para pegar a soma das linhas e das colunas
        float[] somaLin = new float[L];
        float[] somaCol = new float[C];

        //somando a linha
        for (int i = 0; i < mat.length; i++) {
            float somaL = 0;
            float somaC = 0;
            for (int j = 0; j < mat[i].length; j++) {
                somaL += mat[i][j];
                somaLin[i] = somaL;
                somaC += mat[j][i];
                somaCol[i] = somaC;

            }
        }
        //resultado das linhas
        for (int k = 0; k < L; k++) {
        }
        //resultado das colunas
        for (int l = 0; l < C; l++) {
        }

        // vetor para pegar a menor linha das colunas
        float[] menorLin = new float[L];
        float[] menorCol = new float[C];

        //pegando menores valores das linhas e guardando em outro vetor para fazer a separação do ponto de gravidade
        float pegaL = 0;
        float pega2L = 0;
        float pegaTotalL = 0;
        int jL = somaLin.length - 1;

        for (int k = 0; k < somaLin.length; k++) {
            pega2L += somaLin[k];
        }

        for (int iL = 0; iL < somaLin.length; iL++) {
            pegaL = somaLin[iL];
            pegaTotalL = pega2L - pegaL;
            menorLin[iL] = pegaTotalL;
        }

        //pegando menores valores das colunas e guardando em outro vetor para fazer a separação do ponto de gravidade
        float pegaC = 0;
        float pega2C = 0;
        float pegaTotalC = 0;
        int jC = somaCol.length - 1;
        for (int k = 0; k < somaCol.length; k++) {
            pega2C += somaCol[k];
        }

        for (int iC = 0; iC < somaCol.length; iC++) {
            pegaC = somaCol[iC];
            pegaTotalC = pega2C - pegaC;
            menorCol[iC] = pegaTotalC;

        }

        // pegando menor valor do das linhas e verificando sua posição
        float menorL = 0;
        float menorC = 0;
        int posL = 0;
        int posC = 0;
        for (int i = 0; i < menorLin.length; i++) {
            if (i == 0) {
                menorL = menorLin[i];
            } else {

                if (menorLin[i] < menorL) {
                    menorL = menorLin[i];
                    posL = i;
                }
            }
        }
        // pegando menor valor do das colunas e verificando sua posição
        for (int j = 0; j < menorCol.length; j++) {
            if (j == 0) {
                menorC = menorCol[j];
            } else {

                if (menorCol[j] < menorC) {
                    menorC = menorCol[j];
                    posC = j;
                    break;
                }
            }
        }
        // imprimindo o centro de gravidade
        System.out.println("");
        System.out.println("Centro: (" + posL + "," + posC + ")");

    }

}

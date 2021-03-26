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
public class Dicionario {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        FileReader arquivo;
        BufferedReader leBuff;
        arquivo = new FileReader("dicionario.txt");
        leBuff = new BufferedReader(arquivo);
        String[] vetor = new String[1000];

        while (true) {
            String palavras = leBuff.readLine();
            if (palavras == null) {
                break;
            }
            String vetString[] = palavras.split(" ");
            if (palavras.equals(".")) {
                break;
            }
            for (int i = 0; i < vetString.length; i++) {

                vetor[i] = vetString[i];
                System.out.println(vetor[i] + " ");
            }
        }
        leBuff.close();
    }

    public static void impVetor(int A[]) {

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

}

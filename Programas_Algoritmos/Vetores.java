/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosII;

import java.util.Scanner;

/**
 * Exercício: Escreva um programa em Java que leia uma sequência N de números
 * inteiros (negativos, positivos e o zero) para um vetor. No início do programa
 * é solicitado ao usuário (pelo teclado) qual é a quantidade de elementos que
 * serão lidos para o vetor e depois disso os números são lidos para o vetor.
 *
 * @author Alex Yudy Kitahara
 */
public class Vetores {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] V = new int[5];
        boolean crescente = true;

        System.out.println("==============Vetores============");

        for (int i = 0; i < V.length; i++) {
            System.out.print("Digite os numeros que deseja inserir: ");
            V[i] = teclado.nextInt();
        }
        System.out.println("============================");
        System.out.println("\n");
        System.out.print("Soma dos números no vetor: ");
        somar(V);
        System.out.println("============================");
        System.out.print("Maior número no vetor: ");
        MaiorNumero(V);
        System.out.println("============================");
        System.out.print("Menor número no vetor: ");
        MenorNumero(V);
        System.out.println("============================");
        System.out.print("Média dos números pares: ");
        NumerosPares(V);
        System.out.println("============================");
        System.out.print("Percentual dos ímpares: " + "%");
        NumerosImpares(V);
        System.out.println("============================");
        System.out.print("Diferença entre dois elementos distintos no vetor: ");
        diferenca(V);
        System.out.println("============================");
        for (int i = 0; i < V.length - 1; i++) {
            // faz a validacao de n >= n+1
            if (V[i] >= V[i + 1]) {
                crescente = false;
                break;
            }
        }

        if (crescente) {
            System.out.println("Verifica se o vetor está em ordem crescente: " + true);
            System.out.println("\n");
        } else {
            System.out.println("Verifica se o vetor está em ordem crescente: " + false);
            System.out.println("\n");
        }
    }

    public static void somar(int S[]) {
        int soma = 0;
        for (int i = 0; i < S.length; i++) {
            soma = soma + S[i];
        }
        System.out.println(soma);
    }

    public static void MaiorNumero(int S[]) {
        int numeroMaior = 0;
        for (int i = 1; i < S.length; i++) {
            if (S[i] > numeroMaior) {
                numeroMaior = S[i];
            }
        }
        System.out.println(numeroMaior);
    }

    public static void MenorNumero(int S[]) {
        int numeroMenor = Integer.MAX_VALUE;
        for (int i = 0; i < S.length; i++) {
            if (S[i] < numeroMenor) {
                numeroMenor = S[i];
            }
        }
        System.out.println(numeroMenor);
    }

    public static void NumerosPares(int S[]) {
        int soma = 0;
        int par = 0;
        double media = 0.0;
        int quantidade = 0;

        for (int i = 0; i < S.length; i++) {
            if (S[i] % 2 == 0) {
                par++;
                soma = soma + S[i];
                media = soma / par;
            }
        }
        System.out.println(soma);

    }

    public static void NumerosImpares(int S[]) {
        int impar = 0;
        int porcentagem = 0;
        int cont = 0;

        for (int i = 0; i < S.length; i++) {
            if (S[i] % 2 != 0) {
                impar++;
                cont = cont + S[i];
                porcentagem = 100 * impar / cont;

            }
        }
        System.out.println(porcentagem);

    }

    public static void diferenca(int S[]) {
        int maior = 0;
        int menor = 0;
        int aux = 0;

        for (int i = 0; i <= S.length - 1; i++) {

            if (S[i] > maior) {
                maior = S[i];
            }
            if (S[i] < menor) {
                menor = S[i];
            }
            aux = maior - menor - 1;
        }
        System.out.println(aux);

    }

}

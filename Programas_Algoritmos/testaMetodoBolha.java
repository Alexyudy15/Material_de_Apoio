package AlgoritmosII;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class testaMetodoBolha {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int num = 0;

        System.out.println("Digite a quantidade de elementos desejados?");
        num = teclado.nextInt();
        int[] v = new int[num];
        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(num);
        }
        

        int trocas = metodoBolha(v);
        System.out.printf("vetor apos execucao do bolha com %d trocas\n", trocas);
        if (trocas % 2 == 1) {
            System.out.println("Marcelo ganhou!");
        } else {
            System.out.println("Carlos ganhou!");
        }
        impVetor(v);
        System.out.println("\nfim de programa\n");
    }

    public static int metodoBolha(int v[]) {
        int trocas = 0;
        for (int k = 1; k < v.length; k++) {
            for (int i = 0; i < v.length - k; i++) {
                if (v[i] > v[i + 1]) {
                    int temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    trocas++;
                }
            }
        }
        return trocas;
    }

    public static void impVetor(int A[]) {

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }

    }

}

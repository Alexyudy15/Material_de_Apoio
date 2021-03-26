/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgoritmosII;

/**
 *
 * @author Alex
 */
public class TesteInverte {
    public static void main(String[] args){
        int V[] = {4,9,10,8,6};
        
        inverte(V); 
        System.out.print("Vetor invertido: ");
        impVetor(V);
    }
    public static void inverte(int A[]){
        int i =0;
        int j = A.length-1;
        while(i != j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }
    public static void impVetor(int A[]){
       for(int i =0; i<A.length; i++){
           System.out.print(A[i]+ " ");
       } 
    }
}

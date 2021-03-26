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
public class TestaInterseccao {
    public static void main(String[] args){
        int A[] = {7,3,2,8,4};
        int B[] = {7,2,9,4};
        
        System.out.println("Resposta: "+interseccao(A,B));
    }
    public static String interseccao(int A[], int B[]){
    String resp = "";
    for(int i =0; i< A.length; i++){
        for(int j=0; j<B.length; j++){
            if(A[i]==B[j]){
            resp = resp + A[i]+ " ";
        }            
      }
    }    
    return resp;
}
    
}

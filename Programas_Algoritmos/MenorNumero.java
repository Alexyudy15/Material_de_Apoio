/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suporte;

/**
 *
 * @author Alex
 */
public class MenorNumero {
    public static int menor(int a,int b,int c){
        int res;
       
     if(a<b && a<c){
         res = a;
     }
     else if(b<a && b<c){
         res = b;
     }
     else{
         res = c;
     }
        return res;
    }
    
    public static void main(String[] args){
        
        int n1 = 3, n2 = 5, n3 = 1;
        int res = menor(n1,n2,n3);
        
        System.out.print("O menor valor é: " + res);
        
        
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Suporte;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Somatoria {
    public static int somar(int a){
        int res,b,c;
        
        b = a-1;
        c=a-2;
        res = a+b+c;
        
        return res;
    }
    public static void main(String[] args){
        int n1=3;
        int res = somar(n1);
        
        
        System.out.print("A somatória é: " + res);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

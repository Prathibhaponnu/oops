/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21mca034;
import java.util.Scanner;

/**
 *
 * @author sjcet
 */
public class Factorial {
    public static void main(String args[]){
        int num;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        num=s.nextInt();
        long fact=factorial(num);
        System.out.println("Factorial of the number:"+fact);
        
    }
    public static long factorial(int num){
        if(num>1)
        {
            return num*factorial(num-1);
            
        }
        else{
            return 1;
        }
    }
    
    
    
}

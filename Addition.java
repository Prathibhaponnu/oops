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
public class Addition {
    public static void main(String args[]){
        int a,b,c;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        a=sobj.nextInt();
        System.out.println("Enter the second number:");
        b=sobj.nextInt();
        c=a+b;
        System.out.println("Sum is"+c);
        
    }
    
}

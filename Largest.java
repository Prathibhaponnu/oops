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
public class Largest {
    public static void main(String args[])
    {
        int n1,n2,n3;
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the first number:");
        n1=sobj.nextInt();
        System.out.println("Enter the second number:");
        n2=sobj.nextInt();
        System.out.println("Enter the third number:");
        n3=sobj.nextInt();
        if(n1>=n2 && n1>=n3)
        {
            System.out.println("Largest number is:"+n1);
        }
        else if(n2>=n3 && n2>=n1 )
        {
            System.out.println("Largest number is:"+n2);
        }
        else{
            System.out.println("The largest number is:"+n3);
        }     
    }
}

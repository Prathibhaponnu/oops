/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg21mca034;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class sort {
    public static void main(String args[]){
        int count;
        String temp;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the limit:");
        count=s.nextInt();
        System.out.println("Enter the strings:");
          String str1[]=new String[count];
        for(int i=0;i<count;i++)
        {
            str1[i]=s.next();
            
        }
        System.out.println("Strings before sorting:");
        for(int i=0;i<count;i++)
        {
            System.out.println(str1[i]+" ");
        }
        for(int i=0;i<count;i++)
        {
            for(int j=i+1;j<count;j++)
            {
                if(str1[i].compareTo(str1[j])>0)
                {
                temp=str1[i];
                str1[i]=str1[j];
                str1[j]=temp;
            }
        }
        
        
    }
    System.out.println("Sorted string:");
    for(int i=0;i<count;i++)
    {
       System.out.println(str1[i]+" ");
    }
    }
}

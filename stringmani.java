/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class stringmani {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1=s.next();
        System.out.println("Length of the string="+str1.length());
        System.out.println("lowercase="+str1.toLowerCase());
        System.out.println("Uppercase="+str1.toUpperCase());
        System.out.println("character atposition="+str1.charAt(0));
        System.out.println("strings end with e="+str1.endsWith("e"));
        System.out.println("Replace jesus with mary:="+str1.replaceAll("jesus","mary"));
        
        
        
    }
    
}

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
public class complex {
    double real,img;
    complex(){}
    complex(double r,double i)
    {
        this.real=r;
        this.img=i;
    }
    public static complex sum(complex c1,complex c2){
        complex temp=new complex();
        temp.real=c1.real+c2.real;
        temp.img=c1.img+c2.img;
        return temp;
        
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        complex c1=new complex();
        complex c2=new complex();
        System.out.println("Enter the  first real number:");
        c1.real =s.nextDouble();
        System.out.println("Enter the  first imaginary:");
        c1.img=s.nextDouble();
        System.out.println("Enter the second real number:");
        c2.real=s.nextDouble();
        System.out.println("Enter the second imaginary:");
        c2.img=s.nextDouble();
        complex temp=sum(c1,c2);
        System.out.println("sum is:"+temp.real+"+"+temp.img+"i");
    }
    
}

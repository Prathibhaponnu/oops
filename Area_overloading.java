/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sjcet
 */
import java.util.Scanner;
public class Area_overloading{
    double a;
    int s;
    double area()
    {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the value of s:");
        int s=s1.nextInt();
        a=s*s;
        System.out.println("Area of square:"+a);
        return a;
    }
    double area(int r)
    {
        a=3.14*r*r;
        System.out.println("Area of circle:"+a);
        return a;
    }
    double area(int b,int h){
        a=0.5*b*h;
        System.out.println("Area of triangle:"+a);
        return a;
    }
    double area(int h1,int b1,int b2)
    {
        a=h1*(b1+b2)/2;
        System.out.println("Area of trapezoid:"+a);
        return a;
    }
    public static void main(String args[])
    {
        Area_overloading o1=new Area_overloading();
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the value of r:");
        int r=s2.nextInt();
        System.out.println("Enter the value of b and h:");
        int b=s2.nextInt();
        int h=s2.nextInt();
        System.out.println("Enter the value of h1,b1 and b2");
        int h1=s2.nextInt();
        int b1=s2.nextInt();
        int b2=s2.nextInt();
        o1.area();
        o1.area(r);
        o1.area(h,b);
        o1.area(h1,b1,b2);
    }
}
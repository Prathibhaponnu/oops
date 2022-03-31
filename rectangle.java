/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21mca034;

/**
 *
 * @author sjcet
 */
public class rectangle {
    int l,b;

    rectangle(int a,int y) {
        l=a;
        b=y;
    }
    public void perimeter()
    {
        int p;
        p=2*(l+b);
        System.out.println("Perimeter of a rectangle:"+p);
    }
    public void area()
    {
        int r;
        r=l*b;
        System.out.println("Area of the rectangle:"+r);
    }
    public static void main(String arg[]){
        rectangle r1=new rectangle(10,20);
         r1.perimeter();
         r1.area();
    }
}

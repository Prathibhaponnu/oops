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
public class student {
    String name;
    int m1,m2,m3,age;

    student(String s,int a,int b,int c,int x) {
        name=s;
        m1=a;
        m2=b;
        m3=c;
        age=x;
    }
    public void sum ()
    {
        int sum;
        sum=m1+m2+m3;
        System.out.println("sum is="+sum);
    }
    public void percentage()
    {
        float percentage;
        percentage=(m1+m2+m3)*100/300;
        System.out.println("Percentage is="+percentage);
    }
    public void details()
    {
        System.out.println("Name of the student="+name);
        System.out.println("Age of he student="+age);
        
    }
    public static void main(String args[]){
        student s1=new student("prathibha",20,30,40,21);
        student s2=new student("praveena",40,50,60,15);
        s1.sum();
        s1.percentage();
        s1.details();
        s2.sum();
        s2.percentage();
        s2.details();
    }
}

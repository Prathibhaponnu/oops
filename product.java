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
import java.util.Scanner;
public class product {
    int pcode;
    String pname;
    float price;
 product()
{
   Scanner s=new Scanner(System.in);
    System.out.println("Enter the product id:");
    pcode=s.nextInt();
    System.out.println("Enter the product name:");
    pname=s.next();
    System.out.println("Enter the price:");
    price=s.nextFloat();
   }
public void display()
{
    System.out.println("Details of the product with lowest price:");
    System.out.println("pcode:"+pcode);
    System.out.println("product name:"+pname);
    System.out.println("price of the product:"+price);
}
public static void main(String args[]){
    product p1=new product();
    product p2=new product();
    product p3=new product();
  
    if(p1.price<= p2.price && p1.price<= p3.price)
    {
        p1.display();
    }
    else if(p2.price <= p1.price && p2.price <= p3.price)
    {
          p2.display();
    }
    else
    {
       p3.display();
    }
}
}
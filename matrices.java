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
public class matrices {
    public static void main(String args[]){
        int r1,c1,r2,c2;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows of the first matrix:");
        r1=s.nextInt();
        System.out.println("Enter the number of columns of the first matrix:");
        c1=s.nextInt();
        System.out.println("Enter the number of rows of second matrix: ");
        r2=s.nextInt();
        System.out.println("Enter the number of columns of second matrix:");
        c2=s.nextInt();
        if(r1==r2 && c1==c2)
        {
            int a[][]=new int[r1][c1];
            int b[][]=new int[r2][c2];
            int c[][]=new int[r2][c2];
          System.out.println("Enter the elements of the first matrix:");
          for(int i=0;i<r1;i++)
          {
              for(int j=0;j<c1;j++)
              {
                  a[i][j]=s.nextInt();
              }
          }
          System.out.println("");
          System.out.println("Enter the elemenets of the second matrix:");
          for(int i=0;i<r2;i++)
          {
              for(int j=0;j<c2;j++)
              {
                  b[i][j]=s.nextInt();
              }
          }
          System.out.println("");
          System.out.println("First matrix:");
          for(int i=0;i<r1;i++)
          {
              for(int j=0;j<c1;j++)
              {
                  System.out.println(a[i][j]+" ");
              }
              System.out.println(" ");
          }
          System.out.println("Second matrix:");
          for(int i=0;i<r1;i++)
          {
              for(int j=0;j<c1;j++)
              {
                  System.out.println(b[i][j]+" ");
              }
              System.out.println(" ");
          }
          
          for(int i=0;i<r1;i++)
          {
              for(int j=0;j<c2;j++)
              {
                  for(int k=0;k<c1;k++)
                  {
                      c[i][j]=a[i][j]+b[i][j];
                  }
              }
          }
          System.out.println("The resultant matrix:");
          for(int i=0;i<r1;i++)
          {
              for(int j=0;j<c2;j++)
              {
                  System.out.println(c[i][j]+" ");
              }
              System.out.println(" ");
          }
          
          }
        else
        {
            System.out.println("Addition is not posiible");
        }
        
        
    }
    }
    

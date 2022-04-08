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
public class emp {
    int id;
    String name;
    float salary;
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of employees:");
        int n=s.nextInt();
        emp Emp[]=new emp[n];
        System.out.println("Enter the details of the employee:");
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the employee id:");
            Emp[i]=new emp();
            Emp[i].id=s.nextInt();
            System.out.println("Enter the employee name:");
            Emp[i].name=s.next();
            System.out.println("Enter the salary of the employee:");
            Emp[i].salary=s.nextFloat();
        }
        System.out.println("\n\n\n\n...employee deatails.....\n\n");
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee id:"+Emp[i].id);
            System.out.println("Employee name:"+Emp[i].name);
            System.out.println("salary of the employee:"+Emp[i].salary);
            
        }
        
    }
}

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
public class employee {
    int id,salary;
    String ename;
      employee(int a,int b,String  c) {
          id=a;
          salary=b;
          ename=c;
          }
      public void salary()
      {
          int total_salary;
           total_salary=(salary+(salary*20)/100);
          System.out.println("Total salary is"+total_salary);
      }
      public static void main(String args[]){
          employee e=new employee(101,30000,"Prakash");
          e.salary();
      }
    
    
}

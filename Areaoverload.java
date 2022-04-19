/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sjcet
 */

    class AreaShape {
    void area(int x){
        System.out.println("Area of square:"+(x*x));
        }
    void area(int x,int y){
        System.out.println("area of the rectangle:"+(x*y));
    }
    void area(int x,int y,int z){
        double s=(x+y+z)/2;
        double triarea;
        triarea=Math.sqrt(s*(s-x)*(s-y)*(s-z));
        System.out.println("Area of the triangle:"+triarea);
        }
}
public class Areaoverload{
    public static void main(String args[]){
        AreaShape obj=new AreaShape();
        obj.area(10);
        obj.area(5,6);
        obj.area(4,5,6);
        
        
    }
}

    

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package graphics;

/**
 *
 * @author sjcet
 */
import java.util.Scanner;

public class Graphics {

    public static void main(String args[]) {
        double l, b, b1, h, a, r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:");
        l = sc.nextDouble();
        b = sc.nextDouble();
        System.out.println("Enter the base and height of triangle:");
        b1 = sc.nextDouble();
        h = sc.nextDouble();
        System.out.println("Enter the side of the square:");
        a = sc.nextDouble();
        System.out.println("Enter the radius:");
        r=sc.nextDouble();
        Rectangle r1 = new Rectangle();
        r1.area(l, b);
        Triangle t1 = new Triangle();
        t1.area(b1, h);
        Circle c1 = new Circle();
        c1.area(r);
        Square s1 = new Square();
        s1.area(a);
    }
}

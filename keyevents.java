/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sjcet
 */
import java.awt.*;
import java.awt.event.*;
public class keyevents extends Frame implements KeyListener{
Label l;
TextArea area;
keyevents(){
    l=new Label();
    l.setBounds(20,50,100,20);
    area= new TextArea();
    area.setBounds(20,80,300,300);
    area.addKeyListener(this);
    add(l);
    add(area);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
}
public void keyPressed(KeyEvent e ){
    l.setText("key pressed");
}
public void keyReleased(KeyEvent e){
    l.setText("key released");
}
public void keyTyped(KeyEvent e){
    l.setText("key typed");
}

class MyException extends Exception
{
    public MyException(String str)
    {
        System.out.println(str);
    }
 }

public static void main(String args[])
{
new keyevents();
}
}



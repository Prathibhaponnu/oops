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
public class Mouseevents extends Frame implements MouseListener{
    Label l;
    Mouseevents(){
        addMouseListener(this);
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        l.setText("Mouse Clicked");
        
    }
    public void mouseEntered(MouseEvent e){
        l.setText("Mouse entered ");
    }
    public void mouseExited(MouseEvent e){
        l.setText("mouse exited");
    }
    public void mousePressed(MouseEvent e ){
        l.setText("mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        l.setText("mouse released");
    }
    public static void main(String args[]){
        new Mouseevents();
    }
}

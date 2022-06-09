/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sjcet
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Filewrt{
    public static void main(String args[]){
        try{
            FileWriter dataWriter= new FileWriter("DATA.txt");
            dataWriter.write("hai hallo");
            dataWriter.write("world");
            dataWriter.close();
            
           }catch(IOException ex){
               System.out.println("an error occured!");
               ex.printStackTrace();
           }
        try{
            File dataFile =new File("DATA.txt");
            Scanner dataRead=new Scanner(dataFile);
            while(dataRead.hasNextLine()){
                System.out.println(dataRead.nextLine());
            }
            
            dataRead.close();
            }catch(FileNotFoundException ex){
            System.out.println("An error occured!");
            ex.printStackTrace();
        }
           }
    }


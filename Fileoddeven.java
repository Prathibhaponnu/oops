/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sjcet
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Fileoddeven{
    static String data="";
    static File dataFile=new File("example.txt");
    public static void main(String args[]){
        try{
            FileWriter oddFile =new FileWriter("odd.txt");
            FileWriter evenFile=new FileWriter("even.txt");
            Scanner dataRead=new Scanner(dataFile);
            while(dataRead.hasNextLine()){
                data+=dataRead.nextLine();
            }
            dataRead.close();
            String values[]=data.split("");
            int valuesInt[]=new int[values.length+1];
            int count=0;
            for(String i:values){
                valuesInt[count++]=Integer.parseInt(i);
                if(Integer.parseInt(i)%2==0){
                    evenFile.write(i+"");
                    
                }else{
                    oddFile.write(i+"");
                    
                }
            }
            oddFile.close();
            evenFile.close();
            
        }catch(IOException ex){
            System.out.println("An error occured!");
            System.out.println(ex.getMessage());
        }
    }
}
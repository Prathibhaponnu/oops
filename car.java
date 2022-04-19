/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class vehicle{
   protected String brand="ford";
    public void honk(){
        System.out.println("tutt,tut");
    }
}
class car extends vehicle{
    private String modelname="htty";
    public static void main(String args[]){
        car mycar=new car();
        mycar.honk();
        System.out.println(mycar.brand+" "+mycar.modelname);
    }
    
    
}
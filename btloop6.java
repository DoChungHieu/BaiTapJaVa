/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap;

import java.util.Scanner;



/**
 *
 * @author admin
 */
public class btloop6 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
      int min ;
      int max;
      int dudoan;
      int dem=0;
     
      Scanner scanner = new Scanner(System.in);
      System.out.println("Nhập số min:");
      min= scanner.nextInt();
      System.out.println("Nhập vào số max:");
      max= scanner.nextInt();
      
      int random_int = (int)(Math.random() * (max - min + 1) + min);
     
      //Generate random double value from 50 to 100 
//      System.out.println("Random value in double from "+min+" to "+max+ ":");
//      double random_double = Math.random() * (max - min + 1) + min; 
//      System.out.println(random_double);
 
          
           while(dem<3){
               System.out.println("Nhập vào số dự đoán:");
           dudoan = scanner.nextInt();
           
           if(dudoan<random_int){
               System.out.println("Tăng lên!");
           }
           else if(dudoan>random_int){
               System.out.println("Giảm xuống!");
           }else if(dudoan == random_int){
               System.out.println("Bạn đã thắng!");
               break;
           }
           dem++;
           }
           if(dem==3){
               System.out.println("Bạn đã thua!");
           }
           System.out.println("Random value in int from "+min+" to "+max+ ":");
           System.out.println(random_int);
           
           
           
           
           
          
        
      
     
      //Generate random int value from 50 to 100 
      
        
    }
    
}

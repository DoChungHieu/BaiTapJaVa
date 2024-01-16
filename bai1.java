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
public class bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất:");
        num1= scanner.nextInt();
        System.out.println("Nhập vào số thứ hai:");
        num2= scanner.nextInt();
        System.out.println("Nhập vào số thứ ba:");
        num3= scanner.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println(num1+":là số lớn nhất");
        }else if(num2>=num1 && num2>= num3){
            System.out.println(num2+"là số lớn nhất");
        }else{
              System.out.println(num3+"là số lớn nhất");
             }
        
    }
    
}

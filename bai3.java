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
public class bai3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bất kì:");
        n= scanner.nextInt();
        if(n>0){
            System.out.println("Positive");
        }else if(n<0){
            System.out.println("Negative");
        }else{
            System.out.println(n);
        }
    }
    
}

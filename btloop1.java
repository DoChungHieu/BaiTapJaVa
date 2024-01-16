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
public class btloop1 {
    public static long giaithua(int n){
        if(n>0){
            return n+giaithua(n-1);
        }else{
            return 1;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui lòng nhập vào một số bất kì:");
        n=scanner.nextInt();
        System.out.println("Giai thừa của"+n+"là:"+btloop1.giaithua(n));
    }
    
}

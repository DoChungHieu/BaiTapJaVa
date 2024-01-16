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
public class bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float diem;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm:");
        diem= scanner.nextFloat();
        if(diem>8){
            System.out.println(diem+"là điểm giỏi");
        }
        else if(diem<8&&diem>6.5){
            System.out.println(diem+"là điểm khá");
        }else if(diem<6.5&&diem>5){
            System.out.println(diem+"là điểm trung bình");
        }else{
            System.out.println(diem+"là điểm yếu");
        }
    }
    
}

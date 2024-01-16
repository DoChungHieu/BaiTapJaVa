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
public class TongSonguyento {
//  Phương thức kiểm tra số nguyên tố
    public static boolean kiemtra(int songuyento) {
        for (int i = 2; i <= Math.sqrt(songuyento); i++) {
            if (songuyento % i == 0) {
                return false;
            }
        }
        
        return true;

    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tong = 0;
        for (int i = 2; i < 500; i++) {
            if (kiemtra(i)) {
                tong += i;
            }
        }
        
        System.out.println("Tổng các số nguyên tố nhỏ hơn 500 là: " + tong);
    }
    
    
}

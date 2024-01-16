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
public class btloop4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // Nhập số tiền gửi
        System.out.print("Nhập số tiền gửi: ");
        double soTienGui = scanner.nextDouble();

        // Nhập lãi suất hàng tháng
        System.out.print("Nhập lãi suất hàng tháng (%): ");
        double laiSuatHangThang = scanner.nextDouble();

        // Nhập số tháng gửi
        System.out.print("Nhập số tháng gửi: ");
        int soThangGui = scanner.nextInt();

        // Tính lãi kép
        double tongSoTien = soTienGui;
        for (int i = 0; i < soThangGui; i++) {
            double laiSuatThang = (laiSuatHangThang / 100) * tongSoTien;
            tongSoTien += laiSuatThang;
        }

        // In kết quả
        System.out.println("Tổng số tiền sau " + soThangGui + " tháng là: " + tongSoTien);
        double laiKep = tongSoTien - soTienGui;
        System.out.println("Lãi kép sau " + soThangGui + " tháng là: " + laiKep);

        scanner.close();
    }
    
}

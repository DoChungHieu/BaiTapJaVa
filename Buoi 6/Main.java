/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Baitap2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QLSACH qls = new QLSACH();
        Scanner sc = new Scanner(System.in);
        qls.nhapDanhSachTL(sc);
        System.out.println("Nhập loại tài liệu cần tìm:");
        String loai = sc.nextLine();
        qls.timLoaiTL(loai);
        System.out.println("Nhập mã tài liệu cần tìm:");
        String maTL= sc.nextLine();
        qls.timMaTL(maTL);
        sc.close();
    }
    
    
}

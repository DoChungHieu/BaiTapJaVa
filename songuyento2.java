/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap;

/**
 *
 * @author admin
 */
public class songuyento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=2;
        int tong =0;
        while(n<500){
            if(n<2){
                n++;
                continue;
            }
            else{
                boolean flag = true;
                for(int i =2;i<n;i++){
                    if(n%i==0){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    tong +=n;
                }
            }
            n++;
        }
        System.out.println("Tong cac so nguyen to nho hon 500:"+tong);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap;

/**
 *
 * @author admin
 */
public class btloop5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 1;
        for(int i=1; i<=100; i++){
            if(n %3 ==0 && n%5==0){
                System.out.println("Hello world");
            }else if(n%3 ==0){
                System.out.println("Hello");
            }else if( n%5==0){
                System.out.println(" World");
            }
            else{
                System.out.println(n);
            }
            n++;
            
            
        }
    }
    
}

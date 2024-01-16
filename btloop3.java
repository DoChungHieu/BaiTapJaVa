/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package baitap;

/**
 *
 * @author admin
 */
public class btloop3 {
    public static int fibonaci(int n){
        int f0=0;
        int f1=1;
        int fn=1;
        if(n<0){
            return -1;
            
        }else if(n==0 || n==1){
            return n;
        }else{
            for(int i=2; i<n; i++){
                f0=f1;
                f1=fn;
                fn= f0+f1;
            }
        
                }
        return fn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("20 số fibonaci đầu tiên là:");
        for(int i=0;i<20;i++){
            System.out.println(fibonaci(i)+"");
        }
    }
    
}

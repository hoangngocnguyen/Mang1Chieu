/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class soluongchanletrongmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, A[] = new int[100];
      
        do {
            System.out.println("nhập số lượng phần tử của mảng A: ");
            n = scanner.nextInt();
        } while ( n<=0 || n>99) ;
        
        for (int i = 0; i < n; i++) {
            System.out.println("A[" + i + "]= ");
            A[i]= scanner.nextInt();
        }
        
        int soluongchan=0, soluongle=0;
        for (int i=0; i<n; i++) {
            if (A[i] %2 ==0) {
                soluongchan++;
                
            } else {
                soluongle++;
                
            }
        }
        System.out.println("chuỗi A có " + soluongchan +" số chẵn và " + soluongle + " số lẻ.");
     
        
    }
}

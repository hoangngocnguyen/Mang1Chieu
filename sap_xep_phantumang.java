/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class sap_xep_phantumang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // nhập dữ liệu cho mảng
        int n; 
        int array[] = new int[100];
        do {
            System.out.println("nhập số phần tử của mảng: ");
            n = scanner.nextInt();
        } while ( n<=2 ) ; 
        
      
        for (int i = 0; i < n; i++) {
            System.out.println("nhập phần tử số " + i + " : ");
            array[i] = scanner.nextInt();
        }
        
        // sắp xếp phần tử cho mảng
        // tạo ra bản sao của array
        int array2[] = new int[n];
        for (int i=0; i<n; i++) {
            array2[i] = array[i];
        }
        int tamthoi;
        for (int i = 1; i< n-1 ; i++) {
            for (int j= 0; j<n-1 ; j++) {
                if (array2[j] > array2[j+1]) {
                    tamthoi = array2[j];
                    array2[j] = array2[j+1];
                    array2[j+1] = tamthoi;
                /* sai lầm nếu hoán theo kiểu này vì nó 
                    sẽ trả về cùng một giá trị
                    j+1=j
                    và j=j+1 
                    */
                }
                
            }
        }
        System.out.print("mảng khi chưa sắp xếp: ");
        for ( int i=0; i<n; i++){
            System.out.print(array[i] + " "); 
        }
        System.out.println("");
         System.out.print("mảng sau khi sắp xếp: ");
        for ( int i=0; i<n; i++){
            System.out.print(array2[i] + " "); 
        }
        
              
    }
}

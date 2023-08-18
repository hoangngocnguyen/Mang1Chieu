/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Xoaphantu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A[] = new int[100];
        
        int n;
        do {
            System.out.println("nhập số phần tử của mảng A: ");
            n = scanner.nextInt();
        } while (n<=0 || n>99) ;
        
        for( int i=0; i<n; i++) {
            System.out.println("A[" + i +"]= ");
            A[i] = scanner.nextInt();
        }
        
       int count=0,k;
       do{
           System.out.println("nhập vào số nguyên cần loại bỏ: ");
            k = scanner.nextInt();
           
           for( int i=0; i<n; i++) {
             if ( A[i] ==k ) {
                count++;
             }
           }
         
       } while ( count ==0);
     
        
             // khởi tạo hai biến cùng chạy, 
             //gặp số k thì không gán biến x cho biến i
             // tăng biến x lên 1 đơn vị sau mỗi lần tìm k
           System.out.print("mảng A: ");
           for(int i=0; i<n; i++){
              System.out.print(A[i] + " ");
           }
           System.out.println("");
           int i,x;
           for( x=i=0; i<n; i++) {
             if( A[i] != k) {
                 A[x] = A[i];
                 x++;
             } 
           }
         
            System.out.print("mảng A sau khi xóa phần tử có số " + k + " là: ");
    /*    for ( i=0; i<n; i++) {
            System.out.print(A[i] +" ");
        } */   
    //  // khi gán phần tử vẫn còn đó, số phần tử không thể xóa đi
    // chỉ là in ra phần tử ít hơn
    // for i<n thì những phần tử cuối không bị xóa, vẫn có giá trị
     // for i<x là chỉ những phần tử được gán kể từ vị trí đầu tiên
        
        for ( i=0; i<x; i++) {
            System.out.print(A[i] +" ");
        }
        
  
        
    }
}

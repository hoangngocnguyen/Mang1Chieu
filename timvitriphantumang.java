/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class timvitriphantumang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // tìm vị trí đâu tiên xuất hiện của mảng;
        int A[] = new int[100];
        int  n;
        do{
        System.out.println("nhập số phần tử của mảng A: ");
        n = scanner.nextInt();
        } while (n<=0 || n>99 );
        for (int i=0; i<n; i++) {
            System.out.println("A[" + i + "]= ");
            A[i] = scanner.nextInt();
        }
        System.out.println("nhập số k cần tìm: ");
        int k = scanner.nextInt();
       /* int i=0;
        while ((i<n) && (A[i] !=k)) {
            i++;
        }
        
        if (i>=n) {
            System.out.println("chuỗi A không có số " + k +".");
        } else {
            System.out.println("phần tử đầu tiên có giá trị k=" +k +" là A[" + i + "].");           
        } */
       for ( int i=0; i<=n; i++) {
           if ( A[i] != k) {
               if ( i==n) {
                   System.out.println("chuỗi A không có số " + k + ".");
               } else {
               continue;
               }
           } else {
                System.out.println("phần tử đầu tiên có giá trị k=" +k +" là A[" + i + "].");
               break;
             }
           
           }
       
       
    }
}

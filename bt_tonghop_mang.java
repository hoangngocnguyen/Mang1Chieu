/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Arrays;
import java.util.Scanner;
public class bt_tonghop_mang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do{
            System.out.println("nhập số phần tử của mảng");
            n = scanner.nextInt();
        } while (n<=0 || n>99) ;       // điều kiện phần tử
        
        int A[] = new int[n];
        for (int i=0; i<n; i++) {
            System.out.println("A[" + i +"]= ");
            A[i] = scanner.nextInt();
        } // nhập phần tử vào
        
        System.out.println("----------------------");
        System.out.print("mảng A: ");
        for( int i=0; i<n; i++) {
            System.out.print(A[i] +" ");
        } // 1. xuất các giá trị của mảng
         System.out.println("");
         
         
        int max= A[0], min = A[0];
        int countMax=0, countMin=0;
        for (int i=0; i<n; i++) {
            if ( A[i] > max ) {
                countMax=i;
                max = A[i];
            } 
           
            if (A[i] < min){
                countMin=i;
                min = A[i];
            }             
        } 
        
        
        System.out.println("giá trị lớn nhất của mảng A là A[" + countMax +"]= " + max +".");
        System.out.println("giá trị nhỏ nhất của mảng A là A[" + countMin +"]= " + min + ".");
        // 2. tìm phần tử có giá trị nhỏ nhất
        
        int demsochan=0;
        for (int i=0;i<n; i++) {
         if (A[i] % 2 ==0) {
             demsochan++;
         }
        }
         System.out.println("mảng A có " + demsochan +" số chẵn.");
         // 3. đếm số phần tử có giá trị chẵn
         
         /* 
         int temp;
        for (int j=0; j<n-1; j++) {
            for (int i=0; i<n-1; i++) {
                if (A[i] > A[i+1]) {
                    temp = A[i];
                    A[i] = A[i+1];
                    A[i+1] = temp;
                }
            }
         } */// sắp xếp nổi bọt
       
           // cách sắp xếp thứ 2,
           
       // cách 1: nhanh, có sẵn
       //Arrays.sort(A);
         //System.out.println(Arrays.toString(A));
       
         // seclection sort
         
         int temp, min_index;
         for (int i=0; i<n; i++) {
             min_index = i;
             for (int j = i+1; j<n; j++) {
                 if ( A[j] < A[min_index]) {
                     min_index = j;
                 }
             }
             if ( min_index !=i) {
                 temp = A[i];
                 A[i] = A[min_index];
                 A[min_index] = temp;
             }
         }
         
        System.out.print("mảng A sau khi xếp tăng dần: ");
          for(int i=0; i<n; i++) {
              System.out.print(A[i]+ " " );
          }
              // 4. xếp tăng dần các phần tử
         
  
     
        
    
    }

  
} 

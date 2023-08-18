/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class nhapvaomang {   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("khởi tạo mảng.");
        System.out.println("nhập vào số phần tử của mảng: ");
        int size = scanner.nextInt();
        int array[] = new int[size];
        // hoàn thành việc khai báo mảng;
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập vào phần tử số: " + (i+1));
            array [i] = scanner.nextInt();
                      
        }
         for (int i = 0; i < array.length; i++) {
            System.out.println("phần tử số " + (i+1) +" là: " + array[i]);
         }   
         
         // mảng cho sẵn
         int array2[] = new int[] {4,23,4,556,1} ;
         for (int i = 0; i < array2.length; i++) {
            System.out.println("phần tử số " + (i+1) +" của array2 là: " + array[i]);
         }   
         
    }
}

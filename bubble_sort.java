/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */ 
public class bubble_sort {
    public static void main(String[] args) {
        int A[] = new int[] {2,5,3,55,1,25,-3};
        System.out.print("MẢng A ban dầu: ");
        for(int i=0; i<A.length; i++) {
            System.out.print(A[i] +" ");
        }
        System.out.println("");
        int temp;
        // sắp xếp nổi bọt tăng dần 
        for ( int i = 0; i< A.length-2; i++) {
            for (int j = A.length-1; j> i; j--) {
                if ( A[j] < A[j-1]) {
                    temp = A[j-1];
                    A[j-1] = A[j];
                    A[j] = temp;
                }
            }
        }
        System.out.println("mảng A sau khi sắp xếp: ");
        for (int i =0 ; i<A.length; i++) {
             System.out.print(A[i] +" ");
        }
    }
}

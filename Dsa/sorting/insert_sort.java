package Dsa;

import java.util.Scanner;

public class insert_sort  {
    static void insertsort(int arr[],int n ){
           for (int i = 0 ; i< n;i++) {
                int j = i; 
                while (j>0 && arr[j-1]>arr[j]) {
                        int temp = arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j] = temp ;
                        j--;
                }
            }
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("eneter size of array = ");
        int n = t.nextInt();
        int arr []= new int[n];
        System.out.println("enter element of array");
        for (int i =0;i<n;i++){
            arr[i]=t.nextInt();
        }
        insertsort(arr , n);
        System.out.println("sorted array");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

package sorting;


import java.util.Scanner;

public class sel_sort {
    static void selectionsort(int arr[],int n ){
        for (int i = 0 ; i< n;i++) {
            int min = i;
            for (int j = i ; j<= n-1;j++){
                if (arr[min]>arr[j]){
                    min= j ;
                }
            }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp ;
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
        selectionsort(arr , n);
        System.out.println("sorted array");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

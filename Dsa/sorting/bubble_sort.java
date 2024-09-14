package sorting;



import java.util.Scanner;

public class bubble_sort {
    static void bubblesort(int arr[],int n ){
           for (int i = 0 ; i< n;i++) {
         
            for (int j = 0; j< n-1;j++){
                if (arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
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
        bubblesort(arr , n);
        System.out.println("sorted array");
        for (int i =0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

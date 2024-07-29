import java.util.Scanner;

public class arrray {
    public static void main(String[] args) {
         Scanner t =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = t.nextInt();
        int a [ ]= new int[n];
        for (int i = 0 ;i<n;i++){
            System.out.print("Enter the number: ");
            a[i]=t.nextInt();
        }
        for (int i = 0 ;i<a.length;i++){
            System.out.print(a[i]);
        }
    }
}

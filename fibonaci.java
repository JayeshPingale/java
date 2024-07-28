import java.util.Scanner;

public class fibonaci {
        public static void main(String[] args) {
            int a= 0 ,b=1 ;
            int c;
            Scanner t = new Scanner(System.in);
            System.out.println("Enter the number of terms :");
            int  n= t.nextInt();
            for (int i = 0;i<n;i++){
                c = a+b;
                System.out.print(c+" ");
                a=b;
             
                b=c;
            }
            
        }
}

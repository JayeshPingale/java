import java.util.Scanner;

public class swap {
        public static void main(String[] args) {
             Scanner  t = new Scanner(System.in);
        System.out.println("enter  number 1 ");
        int a = t.nextInt();
        System.out.print("enter  number 2 ");
        int b = t.nextInt();
            int temp  ;
            temp = a ;
            a= b ; 
            b= temp;
            System.out.print("number 1 is "+a);
            System.out.print("number 2 is "+b);

        }
}

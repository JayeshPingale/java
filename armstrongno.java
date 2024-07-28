import java.util.Scanner;
import java.lang.Math;;


public class armstrongno {
    public static void main(String[] args) {
        Scanner  t = new Scanner(System.in);
        System.out.println("eneter the armstrong number ");
        int n = t.nextInt(); // 153
        int a= n; //a = 153
        int sum = 0;
        while(n!=0){
            int r = n%10;        //153%10 =3 
            sum = sum + (int)Math.pow(r, 3); // 3*3*3
            // sum = sum +r*r*r;
            n = n/10;   //153/10 = 15 
        }

        if (sum == a){
            System.out.println(a+" is armstrong number");
        }
        else{
            System.out.println(a+" is not armstrong number");
        }


    }
}

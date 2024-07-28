import java.util.Scanner;

public class palinndrome {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = t.nextInt();
        int number = n;
        int rev =0;
        while(n>0){
            int x=n%10;
            rev = rev*10+x;
            n=n/10;
        }
        if (number == rev){
            System.out.println("yes");;
        }
        else {
            System.out.println("no");;

    
        }

    }

}

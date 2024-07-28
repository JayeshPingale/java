import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = t.nextInt();
        int c =0;
        for(int i =1; i<=n;i++){
            if(n%i==0){
            c++;
            }
        }
        if (c ==2){
            System.out.println("The number is prime");
        }
        else{
            System.out.println("The number is not prime");
        }
    }
}

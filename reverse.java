import java.util.Scanner;

class reverse {
    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        System.out.print("Enter the number:  ");
        int number =  t.nextInt();

        int  reverse= 0 ;

        while( number !=0){
            int a = number%10;
            reverse= reverse*10+a;
            number= number/10;
        }
        System.out.println("Reverse of the number is: "+reverse);
    }    
}

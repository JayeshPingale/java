public class rev{
    public static void main(String[] args) {
        int a= 15;
        int b = a ;
        int n= 0;
        int c=0;

        //reverse and palindrome
        while (a!=0){
            int rev = a%10;
            n = rev+n*10;
            a=a/10;
        }
        if (n==b){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }

        //  prime no.
    
    //     for (int i = 1;i<=a;i++){
    //         if(a%i==0) {
    //             c++;
    //     }
    // }

    //     if (c==2){
    //         System.out.println("The number is a prime number");
    //     }else{
    //         System.out.println("The number is not a prime number");
    //     }

    }
}
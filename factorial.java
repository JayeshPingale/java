import java.util.Scanner;

// public class factorial {
//     public static void main(String[] args) {
//         Scanner t =new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n = t.nextInt();

//         int i , f=1;
//         for(i=1;i<=n;i++){
//             f=f*i;
//         }
//         System.out.println("Factorial of "+n+" is "+f);


//     }
    
// }
// class fact{
//     static int facto (int n){

//     }
// }

public class factorial {

  static int fac(int n ){
    if (n==0||n==1){
        return 1;
    }
    else{
        return (n*fac(n-1));
    }
    }
    public static void main(String[] args) {
        Scanner t =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = t.nextInt();
        facto f = new facto();
      int b =  fac(n);
       int a = f.fact(n);
        System.out.println("Factorial of "+n+" is "+a);
        System.out.println(b);

    }
}

class facto{
    public int fact(int n){
        if (n==0||n==1){
            return 1;
        }
        else{
            return (n*fact(n-1));
        }
    }

}


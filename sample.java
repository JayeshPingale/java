import java.util.Scanner;

class sample{
    public static void main(String args[]){
        // Scanner t = new Scanner(System.in);
        // System.err.print("enter the number = ");
        // int n = t.nextInt();
        // int n= 5;
        // int m=4;
        // for (int i = 1;i<=n;i++){
        //     for (int j = 1;j<=m;j++){
        //         if (i==1 || j==1|| i==n||j==m){
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.err.println(" ");
        // }
    //     int n = 4 ; 
    //     for (int i=1 ; i<=n ; i++){
    //         for (int j = 1;j<=n-i  ; j++){
    //             System.out.print(" ");
    //         }
    //         for (int j = 1;j<=i  ; j++){
    //             System.err.print("*");
    //     }
    //     System.out.println();




    // }
        int n =5;

//         for (int i = 1;i<=n;i++){
//             for (int j = 1;j<=i ; j++){
//                 int sum= i+j;
//               if (sum % 2== 0){
//                 System.out.print("1 ");
//               }
//               else {
//                 System.out.print("0 ");
//               }
//         }
//         System.out.println();
// }
        int num=1 ;
        for (int i = 1 ;i<=n ;i++){
            for (int j = 1 ;j<=i ;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(); 
        }



}}

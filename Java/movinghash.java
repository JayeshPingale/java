import java.util.Scanner;

public class movinghash {
    private static void movehash(String str ,int n ){
        String str1 =new String("");
        String str2 =new String("");
        int i=0;
        for (i =0;i<n;i++){
            if (str.charAt(i) == '#'){
                str1 = str1 + str.charAt(i) ;
            }
            else 
                str2 += str.charAt(i);
        }
        String result = str1.concat(str2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner t= new Scanner(System.in);
        String a =t.nextLine();
        int len= a.length();
        movehash(a, len);
    }
}


import java.util.* ;
// import java.io.*; 
public class simpleinterest {
	
	public static void main(String args[]) {
		Scanner ta = new Scanner(System.in);
		int principal_amt=ta.nextInt();
		Double rate = ta.nextDouble();
		int year = ta.nextInt();
		int y = (int)Math.round(rate);

	double total_amt= (principal_amt*y*year);
		double simp = total_amt/100;
		System.out.println(Math.floor(simp));
		
	}
}

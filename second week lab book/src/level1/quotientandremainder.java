package level1;

import java.util.Scanner;

public class quotientandremainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the Dividend");
		int dividend=num.nextInt();
		System.out.println("Enter the Divisor");
		int divisor=num.nextInt();
		int quotient=dividend/divisor;
		System.out.println("Quotient : " +quotient);
		int remainder=dividend%divisor;
		System.out.println("Remainder : " +remainder);
		
		
	}

}

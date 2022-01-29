package level1;

import java.util.Scanner;

public class oddoreven {
	
	public static void main(String[] args) {
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the number to be checked: ");
	int a=num.nextInt();
	if(a%2==0)
		System.out.println("Entered Number is even");
	else
		System.out.println("Entered Number is odd");
}
}

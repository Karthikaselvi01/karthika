package level1;

import java.util.Scanner;

public class multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int first=num.nextInt();
		System.out.println("Enter the second number: ");
		int second=num.nextInt();
		int mul=first*second;
		System.out.println("The multiplication value is "+mul);

	}

}

package level1;

import java.util.Scanner;

public class areaofrect {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle: ");
		double length=s.nextDouble();
		System.out.println("Enter the Breadth of the Rectangle: ");
		double breadth=s.nextDouble();
		double Area=length*breadth;
		System.out.println("Area of the Rectangle= " +Area);
	}

}

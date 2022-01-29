package level1;

import java.util.Scanner;

public class areaofcircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle: ");
		double radius=s.nextDouble();
		double Area=Math.PI*(radius*radius);
		System.out.println("Area of the Circle= " +Area);
		double circumference=2*Math.PI*radius;
		System.out.println("circumference of the Circle= " +circumference);
	}

	}



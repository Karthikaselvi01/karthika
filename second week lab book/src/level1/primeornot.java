package level1;

import java.util.Scanner;

public class primeornot {
	public static void main(String[] args) {
		int temp;
		boolean isprime=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num=s.nextInt();
		s.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime)
		{
			System.out.println(num+ "is a Prime number");
		}
		else
		{
			System.out.println(num+ "is not a Prime number");
		}		
	}
}

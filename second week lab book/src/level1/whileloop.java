package level1;

import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number below 10: ");
		num=s.nextInt();
		while(num<=10)
		{
			sum=sum+num;
			num++;
		}
		System.out.format("Sum of the numbers is : %d",sum);
	}
}

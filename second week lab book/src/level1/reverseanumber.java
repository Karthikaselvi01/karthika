package level1;

import java.util.Scanner;

public class reverseanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int reversenum=0;
		System.out.println("input a number: ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num!=0)
		{
			reversenum=reversenum*10;
			reversenum=reversenum+num%10;
			num=num/10;
		}
		System.out.println("Reverse of input number: "+reversenum);
		

	}

}

package level1;

public class sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]array= {10,20,30,20,50};
		int sum=0;
		for(int num: array)
		{
			sum=sum+num;
		}
		System.out.println("Sum of array elements : "+sum);
	}
}

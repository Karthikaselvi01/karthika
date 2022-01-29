package level1;

public class swaptwonum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=4 ,second=5;
		System.out.println("Before Swapping");
		System.out.println("First Number= " +first);
		System.out.println("Second number = " +second);
		int temporary=first;
		first=second;
		second=temporary;
		System.out.println("After Swapping");
		System.out.println("First Number= " +first);
		System.out.println("Second number = " +second);
	}
}

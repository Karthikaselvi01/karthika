package level1;

public class nestedswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int univ=2;
		int course=1;
		switch(univ) {
		case 1:
			System.out.println("MSU");
			break;
		case 2:
			switch(course)
			{
			case 1:
				System.out.println("MCA");
				break;
		    case 2:
			    System.out.println("MSC");
			}
		}
	}
}

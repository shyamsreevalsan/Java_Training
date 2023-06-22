import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		System.out.println("Enter a number from 1-7:");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1: 
			System.out.println("\nMonday");
			break;
		case 2: 
			System.out.println("\nTuesday");
			break;
		case 3: 
			System.out.println("\nWednesday");
			break;
		case 4: 
			System.out.println("\nThursday");
			break;
		case 5: 
			System.out.println("\nFriday");
			break;
		case 6: 
			System.out.println("\nSaturday");
			break;
		case 7: 
			System.out.println("\nSunday");
			break;

	}

}
}
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: \n");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println("\nNumber is negative");
		}
		else if(num>0) {
			System.out.println("\nNumber is positive");
		}
		else {
			System.out.println("\0 is neither postive or negative");
		}
	}
}

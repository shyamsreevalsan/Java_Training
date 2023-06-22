import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: \n");
		int num1 = sc.nextInt();
		
		System.out.println("\nEnter another number: \n");
		int num2 = sc.nextInt();
		System.out.println("\nEnter another number: \n");
		int num3 = sc.nextInt();

		int grt = num1;
		if(num2>grt) {
			grt=num2;
		}
		if(num3>grt) {
			grt=num3;
		}

		System.out.println("\nThe greatest number is: "+grt);
	}
}
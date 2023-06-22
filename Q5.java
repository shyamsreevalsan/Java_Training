import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 5 numbers: ");
		int sum=0;
		for(int i=0;i<5;i++) {
			System.out.println("\nNumber "+(i+1)+": ");
			int temp = sc.nextInt();
			sum+=temp;
		}
		System.out.println("\nSum = "+sum);
		int avg=sum/5;
		System.out.println("\nAverage: "+avg);
	}

}

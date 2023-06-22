import java.util.Scanner;

public class Q6 {

	int empId;
	char empGen;
	String empName,empAdd;
	long empCnt,empSal;
	
	public void setId(int id) {
		this.empId = id;
	}
	
	public void setSal(long sal) {
		this.empSal = sal;
	}
	
	public void setGen(char gen) {
		this.empGen=gen;
	}
	
	public void setName(String name) {
		this.empName = name;
	}
	
	public void setAdd(String add) {
		this.empAdd = add;
	}
	
	public void setCnt(long cnt) {
		this.empCnt = cnt;
	}
	
	public int getId(int id) {
		return empId;
	}
	
	public long getSal(long sal) {
		return empSal;
	}
	
	public char getGen(char gen) {
		return empGen;
	}
	
	public String getName(String name) {
		return empName;
	}
	
	public String getAdd(String add) {
		return empAdd;
	}
	
	public long getCnt(long cnt) {
		return empCnt;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee details: ");
		Q6 obj = new Q6();
		System.out.println("\nEnter employee ID: ");
		obj.setId(sc.nextInt());
		System.out.println("\nEnter employee name: ");
		obj.setName(sc.next());
		System.out.println("\nEnter employee gender: ");
		obj.setGen(sc.next().charAt(0));
		System.out.println("\nEnter employee salary: ");
		obj.setSal(sc.nextLong());
		System.out.println("\nEnter employee address: ");
		obj.setAdd(sc.next());
		System.out.println("\nEnter employee contact: ");
		obj.setCnt(sc.nextLong());
		
		obj.empDisplay();
	}

	public void empDisplay() {
		// TODO Auto-generated method stub
		System.out.println("Employee Details: ");
		System.out.println("\nName: "+this.empName);
		System.out.println("\nID: "+this.empId);
		System.out.println("\nSalary: "+this.empSal);
		System.out.println("\nAddress: "+this.empAdd);
		System.out.println("\nContact: "+this.empCnt);
		System.out.println("\nGender: "+this.empGen);
	}

}

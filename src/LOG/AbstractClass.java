package LOG;

import java.util.Scanner;

public abstract class AbstractClass {
	String Name;
	int Salary;

	Scanner sc = new Scanner(System.in);

	public void getdata() {
		System.out.println("\nEnter the Name of the Person:");
		Name = sc.nextLine();

		System.out.println("Enter the salary");
		Salary = sc.nextInt();

	}

}

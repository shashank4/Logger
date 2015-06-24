package LOG;

/**
 * 
 * @author CS49 Print On Console
 */
public class Console extends AbstractClass implements MyInterface {

	public void store() {
		System.out.println("\nName\t:" + Name + "\t\tSalary\t:" + Salary);
		System.out.println(""); // New line.
	}
}

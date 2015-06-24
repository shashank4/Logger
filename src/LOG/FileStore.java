package LOG;

import java.io.*;
/**
 * 
 * @author CS49
 *
 */
public class FileStore extends AbstractClass implements MyInterface {

	public void store(String filename) {
		try {
			FileWriter fw = new FileWriter(filename, true);
			BufferedWriter bf = new BufferedWriter(fw);

			bf.newLine();
			bf.append(Name + "\t\t");
			bf.append(Salary + "\t\t");
			bf.newLine();

			bf.close();

		} catch (Exception e) {
			System.out.println("In Exception." + e);
		}

	}

}

package LOG;

import java.io.IOException;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.util.Date;

public class MyMain {

	public static void main(String[] args) throws IOException, SQLException {
		int yn;
		int Choice;
		do {
			System.out
					.println("\n\nEnter your choice:\n1)Console.\n2)File Storage."
							+ "\n3)Dated File Storage.\n4)Database Storage.");
			Scanner sc = new Scanner(System.in);
			Choice = sc.nextInt();

			switch (Choice) {
			case 1:
				Console Print = new Console();
				Print.getdata();
				Print.store();
				break;

			case 2:
				String Filename1 = "temp.txt";

				FileStore file = new FileStore();
				file.getdata();
				file.store(Filename1);
				break;

			case 3:
				DateFormat current = new SimpleDateFormat("MMddyyyy");
				Date current1 = Calendar.getInstance().getTime();
				String FileName2 = current.format(current1) + ".txt";

				FileStore DateFile = new FileStore();
				DateFile.getdata();
				DateFile.store(FileName2);
				break;

			case 4:
				Database DataBaseStore = new Database();
				DataBaseStore.getdata();
				DataBaseStore.store();
				break;

			
			default: System.out.println("\nPlease enter proper choice.");
					break;
			
			}
			System.out.println("Do you want to continue?[1/0]");
			yn=sc.nextInt();
		} while (yn != 0);
	}
}

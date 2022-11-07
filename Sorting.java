package search_algoritham;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner scanner=null;
		Object o;
		File file = new File("C:\\Users\\venne\\OneDrive\\Desktop\\New folder (2)");
		try {
			scanner=new Scanner(file);
			while(scanner.hasNextLine()) {
				String data=scanner.nextLine();
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
	}
	

}

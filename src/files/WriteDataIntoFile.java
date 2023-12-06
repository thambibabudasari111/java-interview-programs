package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoFile {

	public static void main(String[] args) {

		String data = "this is a program to write data into file";
		
		String filePath = "C:\\Users\\thamb\\OneDrive\\Documents\\Files\\output.txt";
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
			writer.write(data);
			System.out.println("data has been written to the file");
			writer.close();
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file: "+e.getMessage());
		}
		
	}

}

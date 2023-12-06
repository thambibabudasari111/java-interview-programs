package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {

	public static void main(String[] args) throws IOException {

		//Approach 1: Using FileReader BufferedReader
		
		String filePath = "C:\\Users\\thamb\\OneDrive\\Documents\\Files\\output.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			
			String str;
			
			while((str=br.readLine())!=null)
			{
				System.out.println(str);	
			}
			br.close();
		} catch (FileNotFoundException e) {
			
			System.out.println("An error occurred while reading the data from file");
		}
	
		
		/*
		 * //Approach 2: Using scanner & file
		File file = new File(filePath);
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		*/
	}
	
	

}

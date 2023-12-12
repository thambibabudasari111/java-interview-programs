package numbers;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumsAndStrings {

	public static void main(String[] args) {

		//Approach 1
		
		Random random = new Random();
		
		int rand_int = random.nextInt(100);
		
		System.out.println(rand_int);
		
		
		//Approach 2 - Math
		//to generate random decimal number
		System.out.println(Math.random());
		
		//Approach 3 - Apache
		String randNum = RandomStringUtils.randomNumeric(10);
		
		System.out.println(randNum);
		
		String randString = RandomStringUtils.randomAlphabetic(5);
		
		System.out.println(randString);

	}

}

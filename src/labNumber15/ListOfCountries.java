package labNumber15;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class ListOfCountries extends CountriesList {

	public static void main(String[] args) {

		Path filePath = Paths.get("ListofCountries.txt");
		File myCountriesFile = filePath.toFile();
		PrintWriter wrt;
		CountriesList cl = new CountriesList();
		//cl.writeToFile(myCountriesFile);
		//need to get rid of this line because it rewrites 
		//the default 4 countries over and over
		String userInput1 = "";
		int userInput = 0;

		System.out.println("Welcome to the Countries Maintenance Application!");

		System.out.println("1 - See the list of countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
		System.out.println("");
		System.out.println("Enter menu number:");

		Scanner scan1 = new Scanner(System.in);
		userInput = scan1.nextInt();

		if (userInput == 1) {
			System.out.println("");
			readToFile(myCountriesFile);

		}

		else if (userInput == 2) {
			System.out.println("Enter country:");
			writeToFileAppend(myCountriesFile);
			// scan1.nextLine();
			System.out.println("Your country has been saved!");
		}

		else {
			System.out.println("Buh-Bye!");
		}

	}

	public static void readToFile(File myCountriesFile) {
		try {
			FileReader reader = new FileReader(myCountriesFile);
			BufferedReader bReader = new BufferedReader(reader);

			String newLine = bReader.readLine();

			while (newLine != null) {
				System.out.println(newLine);
				newLine = bReader.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

		}
	}

	public static void writeToFileAppend(File myCountriesFile) {
		FileWriter wrt = null;
		Scanner scan1 = new Scanner(System.in);
		String userInput1 = scan1.nextLine();
		
		
		try { 
			wrt = new FileWriter(myCountriesFile, true);
			wrt.append(userInput1 + "\n");
			wrt.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

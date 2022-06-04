package Malicious;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SampleFiles {//This class will be used to create files in the system that will be targeted for encryption 

	public static void main(String[] args) {
		SampleFiles SF = new SampleFiles();
		try {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Name: ");
		String name = userInput.next();
		System.out.println("Surname: ");
		String surname = userInput.next();
		System.out.println("Age: ");
		int age = userInput.nextInt();
		System.out.println("Gender: ");
		String sex = userInput.next();
		System.out.println("Favourite music genre: ");
		String genre = userInput.next();
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  //Date formatter used to format date to required standard
		   LocalDateTime now = LocalDateTime.now();  
		   

			File file = new File("SampleDoc1.txt");
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw); 
			
			pw.println(String.format("%-10s%s", name, surname + "\t" + String.format("%-10s%s", age, sex + "\t" + String.format("%-10s%s", genre, dtf.format(now)))));	
			pw.close();
			
			//Second text file input
			System.out.println("Favourite movie: ");
			String favMovie = userInput.next();
			System.out.println("Favourite movie genre: ");
			String favGenre = userInput.next();
			System.out.println("Favourite movie director: ");
			String FavDirector = userInput.next();
			System.out.println("Is Scarface iconic Y/Y? ");
			String Greatness = userInput.next();
			
			File file2 = new File("SampleDoc2.txt");
			FileWriter fw2 = new FileWriter(file2, true);
			PrintWriter pw2 = new PrintWriter(fw2); 
			
			pw2.println(String.format("%-10s%s", favMovie, favGenre + "\t" + String.format("%-10s%s", FavDirector, Greatness + "\t" + dtf.format(now))));	
			pw2.close();
			
			System.out.println("Would you like to return to the landing page Y/N? ");
			String Response = userInput.next();
			
			if(Response.equalsIgnoreCase("Y")) {
				SF.main(args);
			}else if(Response.equalsIgnoreCase("N")){System.out.println("******End of program******");
			
			}else{System.out.println("Well thats wrong :)");
			System.out.println("Start over");
			SF.main(args);
			}
			
		}catch(Exception e) {
			System.out.println("Error!!!");
			System.out.println("Start over");
			SF.main(args);
			}
	}

}

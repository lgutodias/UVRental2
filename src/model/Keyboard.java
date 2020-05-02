package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Keyboard {
	
	public static String textInput(String prompt) {
		System.out.println(prompt);
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	
	public static int numberInput(String prompt) {
		
		System.out.println(prompt);
		int number = 0;
		
		try {
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Enter only numbers!");
			numberInput(prompt);
		}
		return number;
	}
}
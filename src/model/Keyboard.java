package model;

import java.util.Scanner;

public class Keyboard {

	public static String input(String prompt) {
		System.out.println(prompt);
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}
}

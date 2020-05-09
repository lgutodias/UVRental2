package model;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

public class Keyboard {

	public static String textInput(String prompt) {
		System.out.println(prompt);
		String input =  JOptionPane.showInputDialog(null, prompt, "Ultra Vision",JOptionPane.PLAIN_MESSAGE);
		return (input != null) ? input : "";
	}
	
	public static int numberInput(String prompt) {
		
		System.out.println(prompt);
		int number = 0;
		
		try {
			String input = JOptionPane.showInputDialog(null, prompt, "Ultra Vision",JOptionPane.PLAIN_MESSAGE);
			number = Integer.parseInt(input);
		} catch (InputMismatchException e) {
			System.out.println("Enter only numbers!");
			numberInput(prompt);
		}
		return number;
	}
	
	public static void textOutput(String content) {
		JOptionPane.showMessageDialog(null, content);
	}
}

package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import interfaces.Title;

public class UltraVisionFinal {
	
	static List<Title> titles = new ArrayList<>();
	static List<Customer> customers = new ArrayList<>();
	
	static int id = 0;

	public static void main(String[] args) {
		
		boolean running = false;
		
		titles.add(makeAlbum("Clo", "Diego", "Gay"));
		titles.add(makeAlbum("LuLu", "Luiz", "Gay"));
		titles.add(makeLiveConcertVideo("True man", "Raul", "Male"));
		titles.add(makeMovie("Bravo", "John", "comedy"));
		titles.add(makeBoxSet("1", "Lost", "Suspence"));
		
		System.out.println("(1) Create Title");
		System.out.println("(2) Create Customer");
		/*String option = Keyboard.textInput("Enter an option: ");*/
		
		do {
			
			//switch(option) {
			case "1":
				// Create Music
				String name = Keyboard.textInput("Enter music name: ");
				String artist = Keyboard.textInput("Enter music artist: ");
				String genre = Keyboard.textInput("Enter music genre: ");

				titles.add(makeAlbum(name, artist, genre));
			break;

			case "2":
				// Create Customer
				String cName = Keyboard.textInput("Enter name customer: ");

				customers.add(makeCustomer(cName));
			break;

			default:
				System.out.println("Option doesn't exist");
				break;
			}
			
			System.out.println("========== Customer ============");
			displayCustomer(customers);
			System.out.println("-------------------------------");
			
			// Ternary operator
			running = (Keyboard.textInput("Eneter (y/Y) to leave: ").equalsIgnoreCase("y")) ? true : false;
			
		} while(!running);
		
		System.out.println("========== Title ============");
		displayTitle(titles);
		System.out.println("========== Customer ============");
		displayCustomer(customers);
		
		
	} // End main method
	
	public static void displayTitle(List<TitleInterface> p) {
		for (TitleInterface t : p) {
			System.out.println(t);
		}
	}
	
	public static void displayCustomer(List<Customer> customer) {
		for (Customer c : customer) {
			System.out.println(c);
		}
	}
	
	public static Album makeAlbum(String art, String name, String gen) {
		return (Album) new Album().setArtist(art).setName(name).setGenre(gen);
	}
	
	public static LiveConcertVideo makeLiveConcertVideo(String art, String name, String gen) {
		return  (LiveConcertVideo) new LiveConcertVideo().setArtist(art).setName(name).setGenre(gen);
	}
	
	public static Movie makeMovie(String dir, String name, String gen) {
		return (Movie) new Movie().setDirector(dir).setName(name).setGenre(gen);
	}
	
	public static BoxSet makeBoxSet(String sea, String name, String gen) {
		return (BoxSet) new BoxSet().setSeason(sea).setName(name).setGenre(gen);
	}
	
	public static Customer makeCustomer(String name) {
		return new Customer().setId(++id).setName(name);
	}
	
} // End class UltraVideo



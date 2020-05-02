import java.util.ArrayList;
import java.util.List;
import model.Album;
import model.Customer;
import model.Keyboard;
import model.Titles;

public class Main {
	
	static List<Titles> titles = new ArrayList<>();
	static List<Customer> customers = new ArrayList<>();
	
	
	
	public static void main(String[] args) {
		
		boolean running = false;
		
		System.out.println("=====::::::::::| ULTRA VISION |::::::::::=====");
		System.out.println("(1) ADD A TITLE");
		System.out.println("(2) ADD A CUSTOMER");
		System.out.println("=====::::::::::| XXXXXXXXXXXX |::::::::::=====");
		String option = Keyboard.textInput("ENTER AN OPTION: ");
		
		do {
			
			switch (option) {
			case "1":
				//Create Music
				String artist = Keyboard.textInput("ENTER ALBUM NAME: ");
				String title = Keyboard.textInput("ENTER ARTIST: ");
				String genre = Keyboard.textInput("ENTER GENRE: ");
				int year = Keyboard.numberInput("ENTER YEAR OF RELEASE: ");
				String media = Keyboard.textInput("ENTER MEDIA FORMAT: ");
				
				titles.add(makeAlbum(artist, title, genre, year, media));
			break;
			
			case "2":
				//Create Customer
				String fname = Keyboard.textInput("ENTER FIRST NAME: ");
				String lname = Keyboard.textInput("ENTER LAST NAME: ");
				String email = Keyboard.textInput("ENTER EMAIL: ");
				int creditcard  = Keyboard.numberInput("ENTER CREDIT CARD: ");
				
				customers.add(makeCustomer(fname, lname, email, creditcard));
			break;
			
			default:
				System.out.println("OPTION DOESN'T EXIST.");
				break;
			}
			
			// Ternary operator
			running = (Keyboard.textInput("Enter (y/Y) to leave: ").equalsIgnoreCase("y")) ? true : false;
		} while(!running);
		
		
	}
	
	public static Album makeAlbum(String artist, String title, String genre,
			int year, String media) {
		return (Album) new Album().setArtist(artist).setTitle(title)
				.setGenre(genre).setYearOfRelease(year).setMediaFormat(media);
	}
	
	public static Customer makeCustomer(String fname, String lname,
			String email, int creditcard) {
		return new Customer().setFName(fname).setLName(lname).setEmail(email)
				.setCreditCard(creditcard);
	}
	

}
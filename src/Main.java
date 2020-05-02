import java.util.ArrayList;
import java.util.List;
import model.Customer;
import model.Keyboard;
import model.Titles;

public class Main {
	
	static List<Titles> titles = new ArrayList<>();
	static List<Customer> customers = new ArrayList<>();
	
	static int id = 0;
	
	public static void main(String[] args) {
		
		boolean running = false;
		
		System.out.println("=====::::::::::| ULTRA VISION |::::::::::=====");
		System.out.println("(1) ADD A TITLE");
		System.out.println("(2) ADD A CUSTOMER");
		System.out.println("=====::::::::::| XXXXXXXXXXXX |::::::::::=====");
		String option = Keyboard.textInput("ENTER AN OPTION: ");
		
		do {
			
			switch(option) {
			case "1":
				//Create Music
				String title = Keyboard.textInput("ENTER ALBUM NAME: ");
				String artist = Keyboard.textInput("ENTER ARTIST: ");
				String genre = Keyboard.textInput("ENTER GENRE: ");
				int year = Keyboard.numberInput("ENTER YEAR OF RELEASE: ");
				String media = Keyboard.textInput("ENTER MEDIA FORMAT: ");
				
				titles.add(makeAlbum(title, artist, genre, year, media));
			break;
			
			case "2":
				//Create Customer
				String fname = Keyboard.textInput("ENTER FIRST NAME: ");
				String lname = Keyboard.textInput("ENTER LAST NAME: ");
				String email = Keyboard.textInput("ENTER EMAIL: ");
				String  = Keyboard.textInput("ENTER CREDIT CARD: ");
				
				customers.add(makeCustomer(fname, lname, email, ));
			break;
			
			default:
				System.out.println("OPTION DOESN'T EXIST.");
				break;
			}
			
			// Ternary operator
			running = (Keyboard.textInput("Eneter (y/Y) to leave: ").equalsIgnoreCase("y")) ? true : false;)
		} while(!running);
		
		
	}
	
	
	

}
import java.util.ArrayList;
import java.util.List;
//import interfaces.Title;
import model.Album;
import model.BoxSet;
import model.Customer;
import model.Keyboard;
import model.LiveConcertVideo;
import model.Movie;
import model.Titles;

public class Main {
	
	static List<Titles> titles = new ArrayList<>();
	static List<Customer> customers = new ArrayList<>();
	
	static String title;
	static String genre;
	static int year;
	static String media;
	
	
	public static void main(String[] args) {
		
		boolean running = false;
		
		/*titles.add(makeAlbum("Clo", "Diego", "Gay"));
		titles.add(makeAlbum("LuLu", "Luiz", "Gay"));
		titles.add(makeLiveConcertVideo("True man", "Raul", "Male"));
		titles.add(makeMovie("Bravo", "John", "comedy"));
		titles.add(makeBoxSet("1", "Lost", "Suspence"));*/
		
		System.out.println("=====::::::::::| ULTRA VISION |::::::::::=====");
		System.out.println("(1) ADD A TITLE");
		System.out.println("(2) ADD A CUSTOMER");
		System.out.println("(3) ADD A MOVIE");
		System.out.println("=====::::::::::| XXXXXXXXXXXX |::::::::::=====");
		String option = Keyboard.textInput("ENTER AN OPTION: ");
		
		do {
			
			switch (option) {
			case "1":
				//Create Music
				String artist = Keyboard.textInput("ENTER ARTIST/BAND: ");
				title = Keyboard.textInput("ENTER TITLE: ");
				genre = Keyboard.textInput("ENTER GENRE: ");
				year = Keyboard.numberInput("ENTER YEAR OF RELEASE: ");
				media = Keyboard.textInput("ENTER MEDIA FORMAT: ");
				
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
			
			case "3":
				//Create Movie
				title = Keyboard.textInput("ENTER MOVIE TITLE: ");
				genre = Keyboard.textInput("ENTER GENRE: ");
				String director = Keyboard.textInput("ENTER DIRECTOR: ");
				year  = Keyboard.numberInput("ENTER YEAR OF RELEASE: ");
				media  = Keyboard.textInput("ENTER MEDIA FORMAT: ");
				
				titles.add(makeMovie(director, title, genre, year,
						media));
			break;
			
			default:
				System.out.println("OPTION DOESN'T EXIST.");
				break;
			}
			
			// Ternary operator
			running = (Keyboard.textInput("Enter (y/Y) to leave: ")
					.equalsIgnoreCase("y")) ? true : false;
		} while(!running);
		
		System.out.println("========== Title ============");
		displayTitle(titles);
		System.out.println("========== Customer ============");
		displayCustomer(customers);
		
	}
	
	public static void displayTitle(List<Titles> p) {
		for (Titles t : p) {
			System.out.println(t);
		}
	}
	
	public static void displayCustomer(List<Customer> customer) {
		for (Customer c : customer) {
			System.out.println(c);
		}
	}
	
	public static Album makeAlbum(String artist, String title, String genre,
			int year, String media) {
		return (Album) new Album().setArtist(artist).setTitle(title)
				.setGenre(genre).setYearOfRelease(year).setMediaFormat(media);
	}
	
	public static LiveConcertVideo makeLiveConcertVideo(String artist,
			String title, String genre, int year, String media) {
		return  (LiveConcertVideo) new LiveConcertVideo().setArtist(artist)
				.setTitle(title).setGenre(genre).setYearOfRelease(year)
				.setMediaFormat(media);
	}
	
	public static Movie makeMovie(String director, String title,
			String genre, int year, String media) {
		return (Movie) new Movie().setDirector(director).setTitle(title)
				.setGenre(genre).setYearOfRelease(year).setMediaFormat(media);
	}
	
	public static BoxSet makeBoxSet(int season, String title,
			String genre, int year, String media) {
		return (BoxSet) new BoxSet().setSeason(season).setTitle(title)
				.setGenre(genre).setYearOfRelease(year).setMediaFormat(media);
	}
	
	public static Customer makeCustomer(String fname, String lname,
			String email, int creditcard) {
		return new Customer().setFName(fname).setLName(lname).setEmail(email)
				.setCreditCard(creditcard);
	}
	

}
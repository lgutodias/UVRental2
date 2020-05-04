import java.util.ArrayList;
import java.util.List;

import interfaces.Title;
import model.Album;
import model.BoxSet;
import model.Customer;
import model.Keyboard;
import model.LiveConcertVideo;
import model.Movie;
import model.Rental;
import model.Titles;

public class Main {
	
	static List<Title> titles = new ArrayList<>();
	static List<Customer> customers = new ArrayList<>();
	static List<Rental> rentals = new ArrayList<>();
	
	static String title;
	static String genre;
	static int year;
	static String media;
	static int id = 1;
	static int idc = 1;
		
	public static void main(String[] args) {
		
		boolean running = false;
		
		titles.add(makeAlbum(id++, "Pink Floyd", "Pulse", "Rock", 1995, "CD"));
		titles.add(makeAlbum(id++, "Foo Fighters", "Hero", "Rock", 1999, "CD"));
		titles.add(makeAlbum(id++, "Pink", "Nothing", "Pulse", 2002, "CD"));
		titles.add(makeAlbum(id++, "David Guetta", "Live", "Electronic", 2020, "CD"));
		
		
		customers.add(makeCustomer(idc++, "Luiz", "Dias", "luiz@email.com", 200255));
		
		
		do {
			
			System.out.println("=====::::::::::| ULTRA VISION |::::::::::=====");
			System.out.println("(1) RENT A TITLE");
			System.out.println("(2) ADD ALBUM/LIVE CONCERT");
			System.out.println("(3) ADD A MOVIE");
			System.out.println("(4) ADD BOX SET");
			System.out.println("(5) SEARCH TITLE");
			System.out.println("(6) ADD CUSTOMER");
			System.out.println("=====::::::::::| XXXXXXXXXXXX |::::::::::=====");
			String option = Keyboard.textInput("ENTER AN OPTION: ");
			
			switch (option) {
			
			case "1":
				//Rent a Title
				int counter = 0;
				int idCust = Keyboard.numberInput("Enter customer id: ");
				
				for(Rental r : rentals) {
					
					if(r.getCustomer().getId() == idCust) {
						++counter;
					}
				}
				
				if(counter < 4) {
					
					--idCust;
					int idTitle = Keyboard.numberInput("Enter title id: ")-1;
					
					Title title = titles.get(idTitle);
					Customer customer = customers.get(idCust);
					customer.getMemberid().addPoints(10);
					rentals.add(new Rental(customer).addTitle(title));
					
					System.out.println("Title has been rented successfully");
					System.out.println("----------------------------------------------------------");
					
				} else {
					System.out.println("You can't rent any other title. Limit 4 tiles per customer");
					System.out.println("-----------------------------------------------------------");
				}
			break;
			
			case "2":
				//Create Music
				String artist = Keyboard.textInput("ENTER ARTIST/BAND: ");
				title = Keyboard.textInput("ENTER TITLE: ");
				genre = Keyboard.textInput("ENTER GENRE: ");
				year = Keyboard.numberInput("ENTER YEAR OF RELEASE: ");
				media = Keyboard.textInput("ENTER MEDIA FORMAT: ");
				
				titles.add(makeAlbum(id++, artist, title, genre, year, media));
			break;
			
			case "3":
				//Create Movie
				title = Keyboard.textInput("ENTER MOVIE TITLE: ");
				genre = Keyboard.textInput("ENTER GENRE: ");
				String director = Keyboard.textInput("ENTER DIRECTOR: ");
				year  = Keyboard.numberInput("ENTER YEAR OF RELEASE: ");
				media  = Keyboard.textInput("ENTER MEDIA FORMAT: ");
				
				titles.add(makeMovie(id++, director, title, genre, year,
						media));
			break;
			
			case "4":
				//Create Box Set
				/*String fname = Keyboard.textInput("ENTER FIRST NAME: ");
				String lname = Keyboard.textInput("ENTER LAST NAME: ");
				String email = Keyboard.textInput("ENTER EMAIL: ");
				int creditcard  = Keyboard.numberInput("ENTER CREDIT CARD: ");
				
				customers.add(makeCustomer(fname, lname, email, creditcard));*/
			break;
			
			case "5":
				//Search Title
				String word = Keyboard.textInput("ENTER A KEY WORD: ");
				System.out.println("Resultado de pesquisa:" );
				displayTitle(searchTitle(titles, word));
			break;
			
			case "6":
				//Create Customer
				String fname = Keyboard.textInput("ENTER FIRST NAME: ");
				String lname = Keyboard.textInput("ENTER LAST NAME: ");
				String email = Keyboard.textInput("ENTER EMAIL: ");
				int creditcard  = Keyboard.numberInput("ENTER CREDIT CARD: ");
				
				customers.add(makeCustomer(idc++, fname, lname, email, creditcard));
			break;
			
			default:
				System.out.println("Option doesn't exist");
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
	
	static void displayRentals(List<Rental> rentals) {
		for (Rental r : rentals) {
			System.out.println(r);
		}
	}
	
	public static List<Title> searchTitle(List<Title> p, String word) {
		
		List<Title> l = new ArrayList<>();
		word = word.toLowerCase();
		for (Title t : p) {
			if (t.getTitle().toLowerCase().contains(word) || t.getGenre()
					.toLowerCase().contains(word)) {
				l.add(t);
			}
		}
		return l;
	}
	
	public static void displayTitle(List<Title> p) {
		for (Title t : p) {
			System.out.println(t);
		}
	}
	
	public static void displayCustomer(List<Customer> customer) {
		for (Customer c : customer) {
			System.out.println(c);
		}
	}
	
	public static Album makeAlbum(int id, String artist, String title, String genre,
			int year, String media) {
		return (Album) new Album().setArtist(artist).setTitle(title)
				.setGenre(genre).setYearOfRelease(year).setMediaFormat(media)
				.setId(id);
	}
	
	public static LiveConcertVideo makeLiveConcertVideo(int id, String artist,
			String title, String genre, int year, String media) {
		return  (LiveConcertVideo) new LiveConcertVideo().setArtist(artist)
				.setTitle(title).setGenre(genre).setYearOfRelease(year)
				.setMediaFormat(media).setId(id);
	}
	
	public static Movie makeMovie(int id, String director, String title,
			String genre, int year, String media) {
		return (Movie) new Movie().setDirector(director).setTitle(title)
				.setGenre(genre).setYearOfRelease(year).setMediaFormat(media)
				.setId(id);
	}
	
	public static BoxSet makeBoxSet(int id, int season, String title,
			String genre, int year, String media) {
		return (BoxSet) new BoxSet().setSeason(season).setTitle(title)
				.setGenre(genre).setYearOfRelease(year).setMediaFormat(media)
				.setId(id);
	}
	
	public static Customer makeCustomer(int id, String fname, String lname,
			String email, int creditcard) {
		return new Customer().setFName(fname).setLName(lname).setEmail(email)
				.setCreditCard(creditcard).setId(id);
	}
	

}
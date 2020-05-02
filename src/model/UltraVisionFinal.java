import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UltraVision {
	
	static List<TitleInterface> products = new ArrayList<>();
	static List<Customer> customers = new ArrayList<>();
	
	static int id = 0;

	public static void main(String[] args) {
		
		boolean running = false;
		
		products.add(makeSong("Clo", "Diego", "Gay"));
		products.add(makeSong("LuLu", "Luiz", "Gay"));
		products.add(makeLiveConcertVideo("True man", "Raul", "Male"));
		products.add(makeMovie("Bravo", "John", "comedy"));
		products.add(makeBoxSet("1", "Lost", "Suspence"));
		
		System.out.println("(1) Create Title");
		System.out.println("(2) Create Customer");
		String option = Keyboard.textInput("Enter an option: ");
		
		do {
			
			switch(option) {
			case "1":
				// Create Music
				String name = Keyboard.textInput("Enter music name: ");
				String artist = Keyboard.textInput("Enter music artist: ");
				String genre = Keyboard.textInput("Enter music genre: ");

				products.add(makeSong(name, artist, genre));
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
			
			running = (Keyboard.textInput("Eneter (y/Y) to leave: ").equalsIgnoreCase("y")) ? true : false;
			
		} while(!running);
		
		System.out.println("========== Title ============");
		displayTitle(products);
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
	
	public static Song makeSong(String art, String name, String gen) {
		return (Song) new Song().setArtist(art).setName(name).setGenre(gen);
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

class Customer {
	private String name;
	private int id;
	
	public Customer setName(String name) {
		this.name = name;
		return this;
	}
	public String getName() {
		return this.name;
	}
	
	public Customer setId(int id) {
		this.id = id;
		return this;
	}
	public int getId() {
		return this.id;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
}

interface TitleInterface<T> {
	public String getName();
	public T setName(String name);
	public String getGenre();
	public T setGenre(String genre);
}

interface Music<T extends TitleInterface> {
	public String getArtist();
	public T setArtist(String artist);
}

interface Video<T extends TitleInterface> {
	public String getDirector();
	public T setDirector(String director);
}

interface TV<T extends TitleInterface> {
	public String getSeason();
	public T setSeason(String season);
}

abstract class Title implements TitleInterface<Title> {

	private String name;
	private String genre;
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public Title setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String getGenre() {
		return this.genre;
	}

	@Override
	public Title setGenre(String genre) {
		this.genre = genre;
		return this;
	}

	@Override
	public String toString() {
		return "Title [name=" + name + ", genre=" + genre + "]";
	}
	
}

final class Song extends Title implements Music<Song> {

	private String artist;
	
	@Override
	public String getArtist() {
		return this.artist;
	}

	@Override
	public Song setArtist(String artist) {
		this.artist = artist;
		return this;
	}

	@Override
	public String toString() {
		return "Song [artist=" + artist + "]";
	}

}

final class LiveConcertVideo extends Title implements Music<LiveConcertVideo> {

	private String artist;
	
	@Override
	public String getArtist() {
		return this.artist;
	}

	@Override
	public LiveConcertVideo setArtist(String artist) {
		this.artist = artist;
		return this;
	}

	@Override
	public String toString() {
		return "LiveConcertVideo [artist=" + artist + "]";
	}
	
}
		

final class Movie extends Title implements Video<Movie> {

	private String director;
	
	@Override
	public String getDirector() {
		return this.director;
	}

	@Override
	public Movie setDirector(String director) {
		this.director = director;
		return this;
	}
	
}

final class BoxSet extends Title implements TV<BoxSet> {

	private String season;
	
	@Override
	public String getSeason() {
		return this.season;
	}

	@Override
	public BoxSet setSeason(String season) {
		this.season = season;
		return this;
	}
	
}

// =========== The Lovers =====================

interface MembershipPlan<T> {
	public List<T> getAll();
	public void add(T t);
	public void delete(int index);
	public void delete(T t);
	public int size();
	public T get(int index);
}

class Musiclover implements MembershipPlan<Music> {
	
	private List<Music> musics = new ArrayList<>();
	
	// CRUD - C = create; R = read; U = update; D = delete
	@Override
	public List<Music> getAll(){
		return this.musics;
	}
	
	@Override
	public void add(Music m) {
		this.musics.add(m);
	}
	
	@Override
	public void delete(int index) {
		this.musics.remove(this.musics.get(index));
	}
	
	@Override
	public void delete(Music m) {
		this.musics.remove(m);
	}
	
	@Override
	public int size() {
		return this.musics.size();
	}
	
	@Override
	public Music get(int index) {
		return this.musics.get(index);
	}
	
}

class VideoLover implements MembershipPlan<Video> {
	
	private List<Video> videos = new ArrayList<>();
	
	// CRUD - C = create; R = read; U = update; D = delete
	@Override
	public List<Video> getAll(){
		return this.videos;
	}
	
	@Override
	public void add(Video m) {
		this.videos.add(m);
	}
	
	@Override
	public void delete(int index) {
		this.videos.remove(this.videos.get(index));
	}
	
	@Override
	public void delete(Video m) {
		this.videos.remove(m);
	}
	
	@Override
	public int size() {
		return this.videos.size();
	}
	
	@Override
	public Video get(int index) {
		return this.videos.get(index);
	}
}

class TVLover implements MembershipPlan<TV> {
	
	private List<TV> tvs = new ArrayList<>();
	
	// CRUD - C = create; R = read; U = update; D = delete
	@Override
	public List<TV> getAll(){
		return this.tvs;
	}
	
	@Override
	public void add(TV m) {
		this.tvs.add(m);
	}
	
	@Override
	public void delete(int index) {
		this.tvs.remove(this.tvs.get(index));
	}
	
	@Override
	public void delete(TV m) {
		this.tvs.remove(m);
	}
	
	@Override
	public int size() {
		return this.tvs.size();
	}
	
	@Override
	public TV get(int index) {
		return this.tvs.get(index);
	}
}

class Premium implements MembershipPlan<TitleInterface> {
	
	private List<TitleInterface> titles = new ArrayList<>();
	
	// CRUD - C = create; R = read; U = update; D = delete
	@Override
	public List<TitleInterface> getAll(){
		return this.titles;
	}
	
	@Override
	public void add(TitleInterface m) {
		this.titles.add(m);
	}
	
	@Override
	public void delete(int index) {
		this.titles.remove(this.titles.get(index));
	}
	
	@Override
	public void delete(TitleInterface m) {
		this.titles.remove(m);
	}
	
	@Override
	public int size() {
		return this.titles.size();
	}
	
	@Override
	public TitleInterface get(int index) {
		return this.titles.get(index);
	}
}

class Keyboard {
	
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

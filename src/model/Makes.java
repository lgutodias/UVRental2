package model;

public class Makes {
	
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

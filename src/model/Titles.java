package model;

import interfaces.Title;

public abstract class Titles implements Title {
	
	private String title;
	private String genre;
	private int year;
	private String media;
	

	@Override
	public String getTitle() {
		return this.title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getGenre() {
		return this.genre;
	}

	@Override
	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int getYearOfRelease() {
		return this.year;
	}

	@Override
	public void setYearOfRelease(int year) {
		this.year = year;
	}

	@Override
	public String getMediaFormat() {
		return this.media;
	}

	@Override
	public void setMediaFormat(String media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Titles [title=" + title + ", genre=" + genre + ", year=" + year + ", media=" + media + "]";
	}
	
}


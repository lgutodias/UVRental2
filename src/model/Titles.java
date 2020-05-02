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
	public Title setTitle(String title) {
		this.title = title;
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
	public int getYearOfRelease() {
		return this.year;
	}

	@Override
	public Title setYearOfRelease(int year) {
		this.year = year;
		return this;
	}

	@Override
	public String getMediaFormat() {
		return this.media;
	}

	@Override
	public Title setMediaFormat(String media) {
		this.media = media;
		return this;
	}

	@Override
	public String toString() {
		return "Titles [title=" + title + ", genre=" + genre + ", year=" + year + ", media=" + media + "]";
	}
	
}


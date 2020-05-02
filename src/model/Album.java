package model;

import interfaces.Music;

public final class Album extends Titles implements Music<Album> {
	
	private String artist;

	@Override
	public String getArtist() {
		return this.artist;
	}

	@Override
	public Album setArtist(String artist) {
		this.artist = artist;
		return this;
	}

	@Override
	public String toString() {
		return "Album [artist=" + artist + "]";
	}
	
}

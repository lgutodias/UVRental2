package model;

import interfaces.Music;

public final class Album extends Titles implements Music {
	
	private String artist;

	@Override
	public String getArtist() {
		return this.artist;
	}

	@Override
	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Album [artist=" + artist + "]";
	}
	
}

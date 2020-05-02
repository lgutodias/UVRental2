package model;

import interfaces.Video;

public final class Movie extends Titles implements Video {
	
	private String director;

	@Override
	public String getDirector() {
		return this.director;
	}

	@Override
	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [director=" + director + "]";
	}
	
}

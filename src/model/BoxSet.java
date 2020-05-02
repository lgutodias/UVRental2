package model;

import interfaces.TV;

public final class BoxSet extends Titles implements TV {
	
	private int season;

	@Override
	public int getSeason() {
		return this.season;
	}

	@Override
	public void setSeason(int season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "BoxSet [season=" + season + "]";
	}
	
}

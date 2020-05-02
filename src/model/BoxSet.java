package model;

import interfaces.TV;

public final class BoxSet extends Titles implements TV<BoxSet> {
	
	private int season;

	@Override
	public int getSeason() {
		return this.season;
	}

	@Override
	public BoxSet setSeason(int season) {
		this.season = season;
		return this;
	}

	@Override
	public String toString() {
		return "BoxSet [season=" + season + "]";
	}
	
}

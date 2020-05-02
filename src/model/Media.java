package model;

public class Media {
	
	private String cd;
	private String bluray;
	private String dvd;
	
	public Media setCd(String cd) {
		this.cd = cd;
		return this;
	}
	public String getCd() {
		return this.cd;
	}
	public Media setBluray(String bluray) {
		this.bluray = bluray;
		return this;
	}
	public String getBluray() {
		return this.bluray;
	}
	public Media setDvd(String dvd) {
		this.dvd = dvd;
		return this;
	}
	public String getDvd() {
		return this.dvd;
	}
	@Override
	public String toString() {
		return "Media [cd=" + cd + ", bluray=" + bluray + ", dvd=" + dvd + "]";
	}
	

}

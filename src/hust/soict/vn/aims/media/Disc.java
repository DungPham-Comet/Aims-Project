package hust.soict.vn.aims.media;

public class Disc extends Media {
	
	protected int length;
	protected String director;
	
	public Disc() {
		super();
	}
	
	public Disc(int length, String director) {
		super();
		this.length = length;
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	

}

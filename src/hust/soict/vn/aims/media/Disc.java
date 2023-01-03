package hust.soict.vn.aims.media;

public class Disc extends Media {
	
	protected int length;
	protected String director;
	
	public Disc() {
		
	}
	
	public Disc(int id, String title, String category, float cost, int length, String director) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
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
	
	public String toString() {
		return id + " " + title + " " + category + " " + length + " " + director + " " + cost + ".\n";
	}

}

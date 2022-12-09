package hust.soict.vn.aims.media;

public class Track {

	private int length;
	private String title;
	
	public Track() {
		
	}

	public Track(String title) {
		super();
		this.title = title;
	}

	public Track(int length) {
		super();
		this.length = length;
	}
	
	public Track(int length, String title) {
		super();
		this.length = length;
		this.title = title;
	}

	public int getLength() {
		return length;
	}

	public String getTitle() {
		return title;
	}
	
	

}

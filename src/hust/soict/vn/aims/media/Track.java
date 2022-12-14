package hust.soict.vn.aims.media;

public class Track implements Playable {

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
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Track))
			return false;
		Track track1 = (Track) obj;
		if (track1.getTitle() == this.getTitle() && track1.getLength() == this.getLength())
			return true;
		else return false;
	}
}

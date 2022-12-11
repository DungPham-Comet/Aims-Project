package hust.soict.vn.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable {

	private String artist;
	private ArrayList<Track> tracks = new ArrayList<>();
	
	public CompactDisc() {
		super();
	}
	
	public String getArtist() {
		return artist;
	}
	
	public int getLength() {
		int sum = 0;
		for (int i = 0; i < tracks.size(); i++) {
			sum += tracks.get(i).getLength();
		}
		return sum;
	}

	public void addTrack(Track track) {
		if (tracks.contains(track)) {
			System.out.println("The " + track.getTitle() +" is already in the list.");
		}
		else {
			tracks.add(track);
			System.out.println("The " + track.getTitle() + " has been added.");
		}
	}
	
	public void removeTrack(Track track) {
		if (!tracks.contains(track)) {
			System.out.println("The " + track.getTitle() +" is not int the list.");
		}
		else {
			tracks.remove(track);
			System.out.println("The " + track.getTitle() +" has been removed.");
		}
	}
	
	public void play() {
		for (int i = 0; i < tracks.size(); i++) {
			System.out.println("Playing track: " + tracks.get(i).getTitle());
			System.out.println("Track length: " + tracks.get(i).getLength());
		}
	}
	
}

package hust.soict.vn.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{
	
	public int compare(Media md1, Media md2) {
		int costCompare = md1.getCost().compareTo(md2.getCost());
		int titleCompare = md1.getTitle().compareTo(md2.getTitle());
		return (costCompare == 0) ? titleCompare:costCompare;
	}
}

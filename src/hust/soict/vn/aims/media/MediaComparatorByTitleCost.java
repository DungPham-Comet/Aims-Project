package hust.soict.vn.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media> {
	
	public int compare(Media md1, Media md2) {
		int titleCompare = md1.getTitle().compareTo(md2.getTitle());
		int costCompare = md1.getCost().compareTo(md2.getCost());
		return (titleCompare == 0) ? costCompare:titleCompare;
	}
}

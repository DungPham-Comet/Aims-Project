package hust.soict.vn.aims.store;
import java.util.ArrayList;

import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<>();
	
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}
	
	public void addMedia(Media md1) {
		if (itemsInStore.add(md1))
			System.out.println("The " + md1.getTitle() +" has been added to store.");
		else
			System.out.println("Can't add the " + md1.getTitle() +" to store.");
	}
	
	public void removeMedia(Media md1) {
		if (itemsInStore.remove(md1))
			System.out.println("The " + md1.getTitle() +" has been removed from store.");
		else
			System.out.println("There's no items like " + md1.getTitle() +" in store.");
	}
	
	public void displayStore() {
		for (Media m1 : itemsInStore) {
			System.out.print(m1.toString());
		}
	}
}

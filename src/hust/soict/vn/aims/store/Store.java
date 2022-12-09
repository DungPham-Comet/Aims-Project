package hust.soict.vn.aims.store;
import java.util.ArrayList;

import hust.soict.vn.aims.media.DigitalVideoDisc;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<>();
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore.add(dvd);
		System.out.println("The disc has been added");
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i).equals(dvd)) {
				itemsInStore.remove(i);
				System.out.println("The disc has been removed");
			}
		}
	}
	
}

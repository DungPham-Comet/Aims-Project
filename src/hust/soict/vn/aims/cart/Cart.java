package hust.soict.vn.aims.cart;

import java.util.ArrayList;
import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.Media;

public class Cart {
	
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public static final int MAX_NUMBER_ORDERED = 20;
	
	public void addMedia(Media md1) {
		if (itemsOrdered.size() + 1 < MAX_NUMBER_ORDERED) {
			itemsOrdered.add(md1);
			System.out.println("The " + md1.getTitle() +   " has been added to your cart.");
		}
		else {
			System.out.println("Your cart is already full.");
		}
	}
	
	public void removeMedia(Media md1) {
		if (itemsOrdered.remove(md1))
			System.out.println("The " + md1.getId() +" has been removed from your cart.");
		else 
			System.out.println("There's no media like " + md1.getTitle() +" in your cart.");
	}
	
	public float totalCost() {
		float sum = 0f;
		for (int i = 0; i < itemsOrdered.size(); i++) {
			sum += itemsOrdered.get(i).getCost();
		}
		return sum;
	}
}

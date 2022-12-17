package hust.soict.vn.aims;
import hust.soict.vn.aims.cart.Cart;
import hust.soict.vn.aims.media.DigitalVideoDisc;

public class Aims {
	
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addMedia(dvd3);
		//anOrder.printCart();
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
		
	}

}

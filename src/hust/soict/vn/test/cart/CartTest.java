package hust.soict.vn.test.cart;
import hust.soict.vn.aims.cart.Cart;
import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.Media;

public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);
		
		System.out.println(cart.totalCost());
		
		cart.printCart();
		//System.out.println(cart.getItemsOrdered().get(0).toString());
		/*(for (int i = 0; i < cart.getItemsOrdered().size(); i++) {
			System.out.print(cart.getItemsOrdered().get(i).toString());
		}*/
	}

}

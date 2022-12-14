package hust.soict.vn.test.store;
import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		
		Store s1 = new Store();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		s1.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		s1.addMedia(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		s1.addMedia(dvd3);
		
		s1.removeMedia(dvd3);
		
		s1.displayStore();

	}

}

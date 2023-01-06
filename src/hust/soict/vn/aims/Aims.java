package hust.soict.vn.aims;

import java.util.*;
import hust.soict.vn.aims.cart.Cart;
import hust.soict.vn.aims.media.Books;
import hust.soict.vn.aims.media.CompactDisc;
import hust.soict.vn.aims.media.DigitalVideoDisc;
import hust.soict.vn.aims.media.Media;
import hust.soict.vn.aims.media.MediaComparatorByCostTitle;
import hust.soict.vn.aims.media.MediaComparatorByTitleCost;
import hust.soict.vn.aims.media.Track;
import hust.soict.vn.aims.store.Store;

public class Aims {
	
	public static Store store1 = new Store();
	public static Cart cart1 = new Cart();
	
	public static void showMenu() {
		
		while(true) {
			System.out.println("AIMS: ");
			System.out.println("--------------------------------");
			System.out.println("1. View store");		// implement method storeMenu() 
			System.out.println("2. Update store");		// implement method updateStore() 
			System.out.println("3. See current cart");	// implement method seeCurrentCart()
			System.out.println("0. Exit");				// exit AIMS project
			System.out.println("--------------------------------");
			System.out.print("\nPlease choose a number 0-1-2-3: ");
			Scanner kb1 = new Scanner(System.in);
			int option1 = kb1.nextInt();		
			//kb1.nextLine();
			switch(option1) {
			case 1:
				storeMenu();		
				break;
			case 2:
				updateStore();		
				break;
			case 3:
				seeCurrentCart();
				break;
			}
			
			if (option1 == 0) {
				System.out.println("See you next time!");
				break;
			}
		}
	}
	
	public static void storeMenu() {
		store1.displayStore();
		System.out.print("\n");
		while(true) {
			System.out.println("Store Menu Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. See a media’s details");		// implement mediaDetailsMenu() method
			System.out.println("2. Add a media to cart");		// implement addToCart() method
			System.out.println("3. Play a media");				// implement playAMedia() method
			System.out.println("4. See current cart");			// implement seeCurrentCart() method
			System.out.println("0. Back");						// turn back to showMenu()
			System.out.println("--------------------------------");
			System.out.print("\nPlease choose a number 0-1-2-3-4: ");
			Scanner kb2 = new Scanner(System.in);
			int option2 = kb2.nextInt();
			//kb.nextLine();
			switch(option2) {
			case 1:		
				Scanner kb3 = new Scanner(System.in);
				System.out.print("\nPlease enter the title of the media you want to get details: ");
				String title = kb3.nextLine();
				for (Media m1 : store1.getItemsInStore()) {
					if ((m1.getTitle()).equals(title)) {
						mediaDetailsMenu(m1);
					}
				}
				break;
			case 2:		
				addToCart();
				break;
			case 3:		
				playAMedia();
				break;
			case 4:		
				seeCurrentCart();
				break;
			}
			if (option2 == 0) 
				break;
		}
	}
	
	public static void mediaDetailsMenu(Media m1) {
		System.out.println(m1.toString());
		System.out.print("\n");
		while(true) {
			System.out.println("Media Details Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add to cart");		// add media to cart in mediaDetailsMenu
			System.out.println("2. Play");				// play media (CD, DVD) in mediaDetailsMenu
			System.out.println("0. Back");				// turn back to storeMenu()
			System.out.println("--------------------------------");
			System.out.print("\nPlease choose a number 0-1-2: ");
			Scanner kb = new Scanner(System.in);
			int option3 = kb.nextInt();
			kb.nextLine();
			switch(option3) {
			case 1: 
				cart1.addMedia(m1);
				break;
			case 2: 
				if (m1 instanceof DigitalVideoDisc) {
					DigitalVideoDisc d1 = (DigitalVideoDisc) m1;
					d1.play();
				}
				else if (m1 instanceof CompactDisc) {
					CompactDisc c1 = (CompactDisc) m1;
					c1.play();
				}
				else {
					System.out.println("The type of this media can not be played.");
				}
				break;
			}
			if (option3 == 0) 
				break;
		}
	}


	public static void playAMedia() {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the title of the kind of media you want to play: ");
		String title = kb.nextLine();
		
		for (Media m1 : store1.getItemsInStore()) {
			if (m1.getTitle().equals(title)) {
				if (m1 instanceof DigitalVideoDisc) {
					DigitalVideoDisc d1 = (DigitalVideoDisc) m1;
					d1.play();
				}
				else if (m1 instanceof CompactDisc) {
					CompactDisc c1 = (CompactDisc) m1;
					c1.play();
				}
				else 
					System.out.println("\nThe type of this media can not be played.");
			}
			else
				System.out.println("\nThere's no title like " + title +" in cart.");
		}
	}

	public static void addToCart() {
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the title of the kind of media you want to add to your cart: ");
		String title = kb.nextLine();
		int demCD = 0;
		for (Media m1 : store1.getItemsInStore()) {
			if (m1 instanceof DigitalVideoDisc)
				demCD++;
		}
		for (Media m1 : store1.getItemsInStore()) {
			if (m1.getTitle().equals(title)) {
				cart1.addMedia(m1);
				System.out.println("\nNumber of DVDs in your cart: " + demCD);
			}
			else
				System.out.println("There's no media's title like " + title +" in store.");
		}
		
	}
	
	public static void seeCurrentCart() {
		cart1.printCart();
		System.out.print("\n");
		int option4;
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("\nCurrent Cart Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter medias in cart");		// implement method filterMediasInCart();
			System.out.println("2. Sort medias in cart");		// implement method sortMediasInCart();
			System.out.println("3. Remove media from cart");	// implement method removeMediaFromCart();
			System.out.println("4. Play a media");				// implement method playAMediaIFromCart();
			System.out.println("5. Place order");				// implement method placeOrder();
			System.out.println("0. Back");						// implement method showMenu();
			System.out.println("--------------------------------");
			System.out.print("\nPlease choose a number: 0-1-2-3-4-5: ");
			option4 = kb.nextInt();
			//kb.nextLine();
			switch(option4) {
			case 1:
				filterMediasInCart();
				break;
			case 2:
				sortMediasInCart();
				break;
			case 3:
				removeMediaFromCart();
				break;
			case 4:
				playAMediaFromCart();
				break;
			case 5:
				placeOrder();
				break;
			}
			
			if (option4 == 0) 
				break;
		}
	}
	
	public static void placeOrder() {
		cart1.getItemsOrdered().clear();
		System.out.print("\nAn order is created.");
	}

	public static void playAMediaFromCart() {
		Scanner kb =new Scanner(System.in);
		System.out.print("\nPlease enter the title of the CD or DVD you want to play of your cart: ");
		String title = kb.nextLine();
		for (Media m1 : cart1.getItemsOrdered()) {
			if (m1.getTitle().equals(title)) {
				if (m1 instanceof DigitalVideoDisc) {
					DigitalVideoDisc dvd1 = (DigitalVideoDisc) m1;
					dvd1.play();
				}
				else if (m1 instanceof CompactDisc) {
					CompactDisc cd1 = (CompactDisc) m1;
					cd1.play();
				}
				else
					System.out.println("This kind of media can not be played.");
			}
			else
				System.out.println("There's no media's title like " + title +" in your cart.");
		}
		
	}

	public static void removeMediaFromCart() {
		System.out.print("\nPlease enter the title of type of the media you want to remove from cart: ");
		String title;
		Scanner kb = new Scanner(System.in);
		title = kb.nextLine();
		for (int i = 0; i < cart1.getItemsOrdered().size(); i++) {
			if (cart1.getItemsOrdered().get(i).getTitle().equals(title))
				cart1.removeMedia(cart1.getItemsOrdered().get(i));
		}
		
	}

	public static void sortMediasInCart() {
		int option5;
		Scanner kb = new Scanner(System.in);
		while (true) {
			System.out.println("Sort Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Sort by title");
			System.out.println("2. Sort by cost");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.print("\nPlease choose a number: 0-1-2: ");
			option5 = kb.nextInt();
			//kb.nextLine();
			switch(option5) {
			case 1:
				Collections.sort(cart1.getItemsOrdered(), new MediaComparatorByTitleCost());
				break;
			case 2:
				Collections.sort(cart1.getItemsOrdered(), new MediaComparatorByCostTitle());
				break;
			}
			
			if (option5 == 0)
				break;
		}
	}

	public static void filterMediasInCart() {
		
		int option6;
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.println("Filter Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter by id");
			System.out.println("2. Filter by title");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.print("\nPlease choose a number 0-1-2: ");
			option6 = kb.nextInt();
			//kb.nextLine();
			switch(option6) {
			case 1:
				System.out.print("\nPlease enter the id: ");
				int id = kb.nextInt();
				kb.nextLine();
				for (Media m1 : cart1.getItemsOrdered()) {
					if (m1.getId() == id) {
						m1.toString();
					}
				}
				break;
			case 2:
				System.out.print("\nPlease enter the title: ");
				String title = kb.nextLine();
				for (Media m1 : cart1.getItemsOrdered()) {
					if (m1.getTitle().equals(title)) {
						m1.toString();
					}
				}
				break;
			}
			
			if (option6 == 0)
				break;
		}
	}

	public static void updateStore() {	
		int option7;
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Options:");
			System.out.println("--------------------------------");
			System.out.println("1. Add to store");		// implement addToStore() method
			System.out.println("2. Remove from store");	// implement removeFromStore() method
			System.out.println("0. Back");				// turn back to showMenu() 
			System.out.println("--------------------------------");
			System.out.print("Please choose an option to update the store: ");
			option7 = kb.nextInt();
			//kb.nextLine();
			switch (option7) {
			case 1:
				addToStore();
				break;
			case 2:
				removeFromStore();
				break;
			}
			if (option7 == 0)
				break;
		}
	}
	
	public static void removeFromStore() {
		
		System.out.print("\nPlease enter the title of type of the media you want to delete from store: ");
		String title;
		Scanner kb = new Scanner(System.in);
		title = kb.nextLine();
		for (int i = 0; i < store1.getItemsInStore().size(); i++) {
			if (store1.getItemsInStore().get(i).getTitle().equals(title))
				store1.removeMedia(store1.getItemsInStore().get(i));
		}
		
	}

	public static void addToStore() {
		
		while (true) {
			
			System.out.println("What kind of media you want to add to store?");
			System.out.println("Options:");
			System.out.println("--------------------------------");
			System.out.println("1. Book");	
			System.out.println("2. Compact Disc");			
			System.out.println("3. Digital Video Disc");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.print("\nPlease enter the option: ");
			
			int choose;
			Scanner kb1 = new Scanner(System.in);
			choose = kb1.nextInt();
			if (choose == 0)
				break;
			
			System.out.print("\nPlease enter the information of type of the media you want to add to store: ");
			Scanner kb = new Scanner(System.in);
			System.out.print("\nId: ");
			int id = kb.nextInt();
			kb.nextLine();
			System.out.print("\nTitle: ");
			String title = kb.nextLine();
			System.out.print("\nCategory: ");
			String category = kb.nextLine();
			System.out.print("\nCost: ");
			float cost = kb.nextFloat();
			kb.nextLine();
			
			switch(choose) {
			case 1:		// add Book to store
				Books book1 = new Books(id, title, category, cost);
				int authorNumber;
				System.out.print("\nPlease enter the book's number of author: ");
				authorNumber = kb.nextInt();
				kb.nextLine();
				for (int i = 0; i < authorNumber; i++) {
					String author;
					System.out.print("\nPlease enter the book's author's name: ");
					author = kb.nextLine();
					book1.addAuthor(author);
				}
				store1.addMedia(book1);
				break;
				
			case 2:		// add Compact Disc to store
				System.out.print("\nPlease enter the compact disc's length: ");
				int cdLength = kb.nextInt();
				kb.nextLine();
				System.out.print("\nPlease enter the compact disc's director: ");
				String cdDirector = kb.nextLine();
				System.out.print("\nPlease enter the compact disc's artist: ");
				String artist = kb.nextLine();
				CompactDisc cd1 = new CompactDisc(id, title, category, cost, cdLength, cdDirector, artist);
				System.out.print("\nPlease enter the number of tracks in the cd: ");
				int trackNumber = kb.nextInt();
				kb.nextLine();
				for (int i = 0; i < trackNumber; i++) {
					System.out.print("\nPlease enter the length of track: ");
					int trackLength = kb.nextInt();
					kb.nextLine();
					System.out.print("\nPlease enter the title of track: ");
					String trackTitle = kb.nextLine();
					cd1.addTrack(new Track(trackLength, trackTitle));
				}
				store1.addMedia(cd1);
				break;
				
			case 3:		// add Digital Video Disc to store
				System.out.print("\nPlease enter the digital video disc's length: ");
				int dvdLength = kb.nextInt();
				kb.nextLine();
				System.out.print("\nPlease enter the digital video disc's director: ");
				String dvdDirector = kb.nextLine();
				DigitalVideoDisc dvd1 = new DigitalVideoDisc(title, category, dvdDirector, dvdLength, cost);
				store1.addMedia(dvd1);
				break;
			}
		}
	}

	public static void main(String[] args) {
		showMenu();
	}

}

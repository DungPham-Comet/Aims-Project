package hust.soict.vn.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Books extends Media{
	private List<String> authors = new ArrayList<String>();
	
	public Books(int a, String b, String c, float d) {
		super(a,b,c,d);
	}

	public void addAuthor(String authorName) {
		int check = 0;
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).equals(authorName)) {
				check = 1;
				System.out.println("The author is already in the list");
				break;
			}
		}
		if (check == 0) {
			authors.add(authorName);
			System.out.println("The author has been added");
		}
	}
	
	public void removeAuthor(String authorName) {
		int check = 0;
		for (int i = 0 ; i < authors.size(); i++) {
			if (authors.get(i).equals(authorName)) {
				authors.remove(authorName);
				System.out.println("The author has been removed");
				break;
			}
		}
		if (check == 0) {
			System.out.println("There's no author like " + authorName +" in the list");
		}
	}
	
	public String toString() {
		return id + " " + title + " " + category + " " + authors + " " + cost + ".\n";
	}

}

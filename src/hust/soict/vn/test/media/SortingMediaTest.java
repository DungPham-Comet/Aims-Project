package hust.soict.vn.test.media;

import java.util.ArrayList;
import java.util.Collections;
import hust.soict.vn.aims.media.Books;
import hust.soict.vn.aims.media.Media;
import hust.soict.vn.aims.media.MediaComparatorByCostTitle;
import hust.soict.vn.aims.media.MediaComparatorByTitleCost;

public class SortingMediaTest {

	public static void main(String[] args) {
		ArrayList<Media> md = new ArrayList<>();
		md.add(new Books(1,"b2","cate1",29.4f));
		md.add(new Books(2,"a1","cate2",12.59f));
		md.add(new Books(3,"c3","cate2",19.4f));
		md.add(new Books(4,"f4","cate1",17.3f));
		md.add(new Books(5,"f4","cate2",10.3f));
		md.add(new Books(6,"e5","cate4",19.4f));
		
		System.out.println("Before sorting:");
		System.out.println(md);
		
		System.out.println("After sorting by cost - title:");
		Collections.sort(md, new MediaComparatorByCostTitle());
		System.out.println(md);
		
		System.out.println("After sorting by title - cost:");
		Collections.sort(md, new MediaComparatorByTitleCost());
		System.out.println(md);
	}

}

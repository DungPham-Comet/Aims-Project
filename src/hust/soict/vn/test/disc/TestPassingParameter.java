package hust.soict.vn.test.disc;
import hust.soict.vn.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		DigitalVideoDisc  jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cindrellaDVD = new DigitalVideoDisc("Cindrella");
		
		swap(jungleDVD, cindrellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cindrella dvd title: " + cindrellaDVD.getTitle());
		
		trueSwap(jungleDVD,cindrellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cindrella dvd title: " + cindrellaDVD.getTitle());
		
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	public static void trueSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String s1 = dvd1.getTitle();
		String s2 = dvd2.getTitle();
		String oldTitle1 = s1;
		String oldTitle2 = s2;
		dvd1.setTitle(s2);
		dvd2.setTitle(s1);
		dvd1 = new DigitalVideoDisc(oldTitle1);
		dvd2 = new DigitalVideoDisc(oldTitle2);
	}
}

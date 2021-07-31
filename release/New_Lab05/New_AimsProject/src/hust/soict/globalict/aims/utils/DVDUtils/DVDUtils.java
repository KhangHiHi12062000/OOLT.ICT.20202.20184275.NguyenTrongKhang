package hust.soict.globalict.aims.utils.DVDUtils;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class DVDUtils {

	public static String compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		// TODO Auto-generated method stub
		if(dvd1.getCost() > dvd2.getCost()) {
			return dvd1.getTitle() + " is more expensive than " + dvd2.getTitle();
		}
		else if(dvd1.getCost() == dvd2.getCost()){
			return dvd1.getTitle() + " has cost equals to " + dvd2.getTitle();
		}
		return dvd1.getTitle() + " is cheaper than " + dvd2.getTitle();
	}

	public static String compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		// TODO Auto-generated method stub
		if(dvd1.getTitle().compareTo(dvd2.getTitle()) > 0) {
			return dvd1.getTitle() + " is more expensive than " + dvd2.getTitle();
		}
		else if(dvd1.getTitle().compareTo(dvd2.getTitle()) == 0){
			return dvd1.getTitle() + " has equals to " + dvd2.getTitle();
		}
		return dvd1.getTitle() + " is cheaper than " + dvd2.getTitle();
		
	}

	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] digitalVideoDiscs) {
		// TODO Auto-generated method stub
		DigitalVideoDisc[] ListSort = digitalVideoDiscs;
			for(int i = 0 ; i < ListSort.length -1 ; i++) {
				for(int j = i+1 ; j < ListSort.length ; j++) {
					if(ListSort[i].getCost()<ListSort[j].getCost()) {
						DigitalVideoDisc tmp = ListSort[i];
						ListSort[i]=ListSort[j];
						ListSort[j] = tmp;
					}
				}
			}
		return ListSort;
	}

	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] digitalVideoDiscs) {
		// TODO Auto-generated method stub
		DigitalVideoDisc[] ListSort = digitalVideoDiscs;
		for(int i = 0 ; i < ListSort.length -1 ; i++) {
			for(int j = i+1 ; j < ListSort.length ; j++) {
				if(ListSort[i].getTitle().compareTo(ListSort[j].getTitle()) < 0) {
					DigitalVideoDisc tmp = ListSort[i];
					ListSort[i]=ListSort[j];
					ListSort[j] = tmp;
				}
			}
		}
	return ListSort;
	}
	
}

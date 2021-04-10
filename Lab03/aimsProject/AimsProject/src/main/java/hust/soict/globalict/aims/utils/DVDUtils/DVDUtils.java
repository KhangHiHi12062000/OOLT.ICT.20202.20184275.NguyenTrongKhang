
public class DVDUtils {
	public static String compareByCost(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(dvd1.getCost() > dvd2.getCost()) {
			return dvd1.getTitle()+ " is more expensive than " +dvd2.getTitle();
		}
		else if(dvd1.getCost()==dvd2.getCost()) {
			return dvd1.getTitle()+ " is equals to " +dvd2.getTitle();
		}
		else {
			return dvd1.getTitle()+ " is cheaper than " +dvd2.getTitle();
		}
	}
	public static String compareByTitle(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		int string = dvd1.getTitle().compareTo(dvd2.getTitle());
		if(string>0) {
			return dvd1.getTitle()+ " is more expensive than " +dvd2.getTitle();
		} 
		else if(string ==0) {
			return dvd1.getTitle()+ " is equals to " +dvd2.getTitle();
		}
		else {
			return dvd1.getTitle()+ " is cheaper than " +dvd2.getTitle();
		}
	}
	public static DigitalVideoDisc[] sortByCost(DigitalVideoDisc[] d) {
		DigitalVideoDisc[] sort = d;
		for(int i=0; i< d.length-1; i++) {
			for(int j=i+1; j<d.length;j++) {
				if(sort[i].getCost()<sort[j].getCost()) {
					DigitalVideoDisc dvd = sort[i];
					sort[i]=sort[j];
					sort[j]= dvd;
				}
			}
		}
		return sort;
	}
	public static DigitalVideoDisc[] sortByTitle(DigitalVideoDisc[] d) {
		DigitalVideoDisc[] sort = d;
		for(int i=0; i< d.length-1; i++) {
			for(int j=i+1; j<d.length;j++) {
				int string = sort[i].getTitle().compareTo(sort[j].getTitle());
				if(string<0){
					DigitalVideoDisc dvd = sort[i];
					sort[i]=sort[j];
					sort[j]= dvd;
				}
			}
		}
		return sort;
	}
	
}
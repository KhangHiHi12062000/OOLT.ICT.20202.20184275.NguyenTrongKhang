package main.java;

public class CartTest {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		// TODO Auto-generated method stub
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA","aaaa","aaaa",1,5.6f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB","bbbb","bbbb",2,5.3f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC","cccc","cccc",3,5f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD","dddd","dddd",4,7.1f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE","eeee","eeee",5,3.3f);
		anOrder.addDigitalVideoDisc(new DigitalVideoDisc[] {dvd1,dvd2,dvd3,dvd4,dvd5});
		anOrder.sortByCostCart();
		anOrder.sortByTitleCart();
	    System.out.println("Search by ID:");
		anOrder.searchByID(2);
		anOrder.sortByLengthCart();
	}

}

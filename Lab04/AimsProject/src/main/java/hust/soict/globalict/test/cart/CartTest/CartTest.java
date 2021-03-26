package hust.soict.globalict.test.cart.CartTest;
import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		
	DigitalVideoDisc dvd1= new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f,100);
	anOrder.addDigitalVideoDisc(dvd1);
	DigitalVideoDisc dvd2= new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 45, 24.95f,200);
	anOrder.addDigitalVideoDisc(dvd2);
	DigitalVideoDisc dvd3= new DigitalVideoDisc("Aladin","Animation","ssdsad", 30, 18.99f,300);
	anOrder.addDigitalVideoDisc(dvd3);
	anOrder.sortByCostCart();
	anOrder.sortByTitleCart();
        System.out.println("Search by ID:");
	anOrder.searchByID(100);
	anOrder.sortByLengthCart();
	}
}


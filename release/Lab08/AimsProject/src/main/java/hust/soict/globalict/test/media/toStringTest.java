
package hust.soict.globalict.test.media;

import hust.soict.globalict.aims.media.Book;
import java.util.ArrayList;
import java.util.List;

public class toStringTest {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> authors = new ArrayList<String>();
		authors.add("Thao");
		authors.add("Chipp");
		authors.add("Cross");
		Book Book1;
//		System.out.println("This test for contentsTokens",Book1.getContentTokens());
        Book1 = new Book("Wars", "Story", 30f, authors,"i can can the can. But you, see you");
	
		System.out.print(Book1.toString());
	}
}

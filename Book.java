package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isExist(String authorName) {
		for(int i = 0; i < authors.size(); i++)
			if(authors.get(i).toLowerCase().compareTo(authorName.toLowerCase()) > 0) return true;
		return false;
	}
	
	public void addAuthor(String authorName) {
		boolean isExist = isExist(authorName);
		if(isExist)
			System.out.println("\nAuthor " + authorName + " is existed!");
		else {
			authors.add(authorName);
			System.out.println("\nAuthor " + authorName + " has been added successfully!");
		}
	}
	
	public void removeAuthor(String authorName) {

		boolean isExist = isExist(authorName);
		if(!isExist)
			System.out.println("\nAuthor " + authorName + " is not exist!");
		else {
			authors.remove(authorName);
			System.out.println("\nAuthor " + authorName + " has been removed successfully!");
		}
	}
}

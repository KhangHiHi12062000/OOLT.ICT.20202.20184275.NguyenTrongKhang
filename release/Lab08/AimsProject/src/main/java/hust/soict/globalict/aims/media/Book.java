package hust.soict.globalict.aims.media;
import java.util.ArrayList;  
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
        private String content ;
        private String[] contentTokens = new String[1000];
        private HashMap<String,Integer> wordFrequency = new HashMap<String, Integer>();
        public void ProcessContent() {
		int lengthContent = 0;
		String[] ex;
		ex = content.split("[, ?.@]+");
		Arrays.sort(ex);
		int x = 0;
		for (int i =1;i<ex.length;i++) {
			//System.out.println(ex[i]+"Ngoai if else ");
			if (!ex[i].equals(ex[i-1])) {
				contentTokens[lengthContent] = new String( ex[i]); 
				lengthContent++;
				 wordFrequency.put(ex[i-1], x+1);
				 x = 0;
				// System.out.println(ex[i]+"VAo ne if ");
			}else {
				//System.out.println(ex[i]+"VAo ne else ");
				x++;
			}
		}
			wordFrequency.put(ex[ex.length-1], x+1);		
		
	}
        public String toString() {
		return ("Info of this book is: "+this.getId()+"\t"+this.getCategory()+"\t"+this.authors+"\t"+this.content+"\t"+this.getCost()+"\t"+this.wordFrequency+"\t");
        }
		
	public Book( String title, String category, float cost, List<String> authors,String content) {
		super(title,category,cost);
		this.authors = authors;
		this.content = content;
		ProcessContent();
	}
	public void copyContentOf(Book book) {
		super.setTitle(book.getTitle());
		super.setCategory(book.getCategory());
		for(String author : book.authors) {
			String copyAuthor = author;
			authors.add(copyAuthor);
		}
		super.setCost(book.getCost());
		super.setId(book.getId());
		super.setDateAdded(book.getDateAdded());
	}
	
	// Update
	public void addAuthor(String name) {
		if (name == null) {
			System.out.println("The string input is null");
			return;
		}
		
		if (authors.contains(name)) {
			System.out.println("The author has been added before");
		} else {
			authors.add(name);
			System.out.println("Author " + name + " has been added");
		}
	}
	
	public void removeAuthor(String name) {
		if (name == null) {
			System.out.println("The string input is null");
			return;
		}
		
		if (authors.contains(name)) {
			authors.remove(name);
			System.out.println("Author " + name + " has been removed");
		} else {
			System.out.println("Cannot find " + name + " in the author list");
		}
	}
	
	
	// Init
	public Book() {
		super();
	}
	
	public Book(String title, String category, float cost, String...inputAuthors) {
		super(title, category, cost);
		for (String author : inputAuthors) {
			if (author != null) {
				authors.add(author);
			}
		}
	}
	
	// Getter
	public String getAuthorsString() {
		String result = new String();
		for (String author : authors) {
			result += author + ", ";
		}
		return result;
	}
	
	public String getDetail() {
		String result = "\tBook - ";
		result += "ID: " + getId() + " - ";
		result += getTitle() + " - ";
		result += "by " + getAuthorsString() + " - ";
		result += getCost() + "$";
		return result;
	}

	public List<String> getAuthors() {
		return authors;
	}

    @Override
    public int compareTo(Media o) {
        if(!this.getTitle().equals(o.getTitle())){
            return this.getTitle().compareTo(o.getTitle());
        }
        
        return this.getCategory().compareTo(o.getCategory());
    }
   
}

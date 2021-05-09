package hust.soict.globalict.aims.media;
import hust.soict.globalict.aims.media.CompactDisc;
import hust.soict.globalict.aims.media.CompareMedia.MediaComparatorByCostTitle;
import hust.soict.globalict.aims.media.CompareMedia.MediaComparatorByTitleCost;
import java.time.LocalDate;
import java.util.Comparator;

public abstract class Media implements Comparable<Media>{
	public static int numMediaCreated = 0;
	private int id;
	private String title;
	private String category;
	private float cost;
	private LocalDate dateAdded;
	
	// Init
	public Media() {
		dateAdded = LocalDate.now();
		id = numMediaCreated;
		numMediaCreated++;
	}
	
	public Media(String title, String category, float cost) {
		this();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	// Checking
        public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
        public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public boolean titleContains(String words) {
		if (words == null || title == null) {
			return false;
		}
		// Convert 2 strings to lower case
		words = words.toLowerCase();
		String lowercaseTitle = title.toLowerCase();
	
		// Split the input tokens to an array of tokens
		String[] tokens = words.split(" ");
		
		// Check the tokens one by one
		for (String token : tokens) {
			if (lowercaseTitle.contains(token)) {
				return true;
			}
		}
		return false;	
	}
	
	
	
	// Getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}

	public static int getNumMediaCreated() {
		return numMediaCreated;
	}
        @Override
        public boolean equals(Object obj){
            if(obj instanceof Media){
                Media that = (Media) obj;
                return this.id == that.id;
            }
            else return false;
        }
         /*@Override
	public int compareTo(Media o) {
		// TODO Auto-generated method stub
		//System.out.println("We are comparing "+o.getTitle()+"with"+this.title);
		int i =  this.title.compareTo(o.getTitle());
		if (i != 0) return i;
		i =(int) ( o.getCost() - this.cost);    
	    if (i != 0) return i;
            
	    return i = this.category.compareTo(o.getCategory());
	   
		//return 0;
	}*/
        public String getDetail() {
		String result = "\tMedia - ";
		result += "ID: " + getId() + " - ";
		result += getTitle() + " - ";
		result += " - " + category + " - ";
		result += getCost() + "$";
		return result;
	}
}

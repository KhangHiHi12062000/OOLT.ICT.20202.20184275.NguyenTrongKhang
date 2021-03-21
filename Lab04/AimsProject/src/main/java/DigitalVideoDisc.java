
import java.time.LocalDate;


public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    private LocalDate dateAdded;
    private static int nbDigitalVideoDiscs = 0;

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
        DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private int id;

    /**
     *
     * @param title
     * @param category
     * @param director
     * @param length
     * @param cost
     * @param dateAdded
     */
    public DigitalVideoDisc(String title, String category, String director, int length, float cost, LocalDate dateAdded) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        this.dateAdded = dateAdded;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc() {
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
        public  DigitalVideoDisc(String title, String category, float cost) {
		
		this.title = title;
		this.category = category;
		this.cost = cost;
		nbDigitalVideoDiscs++;
                this.id = nbDigitalVideoDiscs;
	}
	public  DigitalVideoDisc(String title, String category, String director, float cost) {
	
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		nbDigitalVideoDiscs++;
                this.id = nbDigitalVideoDiscs;
	}

    /**
     *
     * @param title
     * @param category
     * @param director
     * @param length
     * @param cost
     */
    public  DigitalVideoDisc(String title, String category, String director, int length, float cost) {
	
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
                this.id = nbDigitalVideoDiscs;
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost, LocalDate dateAdded,int id) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		this.dateAdded = dateAdded;
		nbDigitalVideoDiscs++;
                this.id = nbDigitalVideoDiscs;
        }

    public DigitalVideoDisc(String title) {
        this.title = title;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }
	
	public DigitalVideoDisc( String title, String category, String director, int length, float cost,int id) {
                super();
		this.title = title; 
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		nbDigitalVideoDiscs++;
                this.id = nbDigitalVideoDiscs;
	}

    public String getDetail(){
		return "DVD " + title + " - " + category + " - " + " - " +director+ " - "+length + ": " +cost +" $";
	}
    
}
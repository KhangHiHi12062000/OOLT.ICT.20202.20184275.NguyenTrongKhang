package main.java;

import java.time.LocalDate;

public class DigitalVideoDisc {
	 	private String title;
	    private String category;
	    private String director;
	    private int length;
	    private float cost;
	    private int id;
	    private static int nbDigitalVideoDiscs = 0;
	    private LocalDate dateAdded;
		public DigitalVideoDisc() {
			nbDigitalVideoDiscs++;
			this.id = nbDigitalVideoDiscs;
		}
		public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
			this.title = title;
			this.category = category;
			this.director = director;
			this.length = length;
			this.cost = cost;
			nbDigitalVideoDiscs++;
			this.id = nbDigitalVideoDiscs;
		}
		
		public DigitalVideoDisc(String title, String category, String director, int length, float cost,
				LocalDate dateAdded) {
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
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public static int getNbDigitalVideoDiscs() {
			return nbDigitalVideoDiscs;
		}
		public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
			DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
		}
		public LocalDate getDateAdded() {
			return dateAdded;
		}
		public void setDateAdded(LocalDate dateAdded) {
			this.dateAdded = dateAdded;
		}
		
		@Override
		public String toString() {
			return "DigitalVideoDisc [title=" + title + ", category=" + category + ", director=" + director
					+ ", length=" + length + ", cost=" + cost + ", id=" + id + ", dateAdded=" + dateAdded + "]";
		}
		public String getDetail() {
			// TODO Auto-generated method stub
			return "|"+id+".DVD "+"|" + title + " | " + category + " | " + "  " +director+ "  | "+length + " | " +cost +" $ |";
		}
	    
}

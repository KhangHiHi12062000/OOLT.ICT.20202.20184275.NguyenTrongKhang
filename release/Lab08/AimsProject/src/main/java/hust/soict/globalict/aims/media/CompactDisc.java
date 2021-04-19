
package hust.soict.globalict.aims.media;

import java.util.ArrayList;


public class CompactDisc extends Dics implements Playable{
    private int id;
    private String title;
    private String category;
    private float cost;
    private String artist;
    private int length;
    private static final int MAX=20;
    private int nbDics;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    public CompactDisc() {
    }

    public CompactDisc(String title, String category, float cost, String artist) {
        super();
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artist = artist;
        id = nbDics;
        nbDics++;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void addTrack(Track...newTrackList){
	for (Track newTrack : newTrackList) {
		if (this.isFull()) {
			System.out.println("The cart is full. Cannot add more Track");
			return;
		} else {
			if (newTrack == null) {
				System.out.println("The new Track is null");
			} else {
				tracks.add(newTrack);
				System.out.println("Added " + newTrack.getTitle() + " to the CD");
                        }
		}
	}
    }
    public void removeTrack(int id){
        for (Track item : tracks) {
			if (item.getId() == id) {
				tracks.remove(item);
				System.out.println("Removed " + id + " from the CD");
				return;
			}
		}
		System.out.println("Cannot Found");
    }
    public boolean isFull() {
		return tracks.size() >= MAX;
	}
    public int getlength(){
        int tmp = 0;
        for(Track item : tracks){
            tmp = item.getLength()+tmp;
        }
        this.length = tmp;
        return this.length;
    }

    @Override
    public void Play() {
        System.out.println("Begin to play CD :");
        for(Track item : tracks){
            item.Play();
        }
    }
    public String getDetail() {
		String result = "\tCD - ";
		result += "ID: " + getId() + " - ";
		result += getTitle() + " - ";
		result += "- " + getlength() + " - ";
		result += getCost() + "$";
		return result;
	}   
}

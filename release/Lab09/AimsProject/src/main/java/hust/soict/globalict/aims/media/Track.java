
package hust.soict.globalict.aims.media;
public class Track implements Playable,Comparable<Track>{
    private String title;
    private int length;
    private int nbTrack;
    private int id;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
        id = nbTrack;
        nbTrack++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Track(int length) {
        this.length = length;
    }

    public Track(String title) {
        this.title = title;
    }

    public Track() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void Play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Track){
            Track that = (Track) obj;
            return this.title == that.title && this.length == that.length;
        }
        else return false;
    }

    @Override
	public int compareTo(Track o) {
            if(!this.getTitle().equals(o.getTitle())){
                return this.getTitle().compareTo(o.getTitle());
            }else
		return this.getLength() - o.getLength();
	}
}

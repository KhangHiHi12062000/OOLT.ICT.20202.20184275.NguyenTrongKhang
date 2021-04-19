
package hust.soict.globalict.aims.media;
public class Dics extends Media{

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    private String Director;
    private int length;

    @Override
    public int compareTo(Media o) {
        if(!this.getTitle().equals(o.getTitle())){
            return this.getTitle().compareTo(o.getTitle());
        }
        
        return this.getCategory().compareTo(o.getCategory());
    }

    

}

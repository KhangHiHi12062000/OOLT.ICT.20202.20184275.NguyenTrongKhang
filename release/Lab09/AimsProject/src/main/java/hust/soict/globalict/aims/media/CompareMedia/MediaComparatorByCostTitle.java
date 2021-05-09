package hust.soict.globalict.aims.media.CompareMedia;
import java.util.Comparator;
import hust.soict.globalict.aims.media.Media;

public class MediaComparatorByCostTitle implements Comparator<Media>{
    
    @Override
    public int compare(Media o1,Media o2) {
        if(o1.getCost() != o2.getCost()){
            return (int) (o1.getCost() - o2.getCost());
        }
        else
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

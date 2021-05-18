package hust.soict.globalict.aims.utils.MediaUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import hust.soict.globalict.aims.media.Media;
import javafx.collections.ObservableList;

public class MediaUtils {
	public static void sortByCost(ObservableList<Media> itemsOrdered) {
		Collections.sort(itemsOrdered, Comparator.comparing(Media::getCost));
	}
	
	public static void sortByTitle(ObservableList<Media> itemsOrdered) {
		Collections.sort(itemsOrdered, Comparator.comparing(Media::getTitle));
	}
	
	public static void sortByTitleAndCost(ObservableList<Media> itemsOrdered) {
		Collections.sort(itemsOrdered, Comparator.comparing(Media::getTitle)
				.thenComparing(Media::getCost));
	}
}


package hust.soict.globalict.aims.Store;

import hust.soict.globalict.aims.Store.Store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store S = new Store();
   
        DigitalVideoDisc Div1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87, (float) 19.95);
        DigitalVideoDisc Div2 = new DigitalVideoDisc("Star Wars","Science","George Lucas",87, (float) 24.95);
        DigitalVideoDisc Div3 = new DigitalVideoDisc("Aladin","Animation","",0, (float) 18.99);
        S.addDVD(Div1);
        S.addDVD(Div2);
        S.addDVD(Div3);
    }
}

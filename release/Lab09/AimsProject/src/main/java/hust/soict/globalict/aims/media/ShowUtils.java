package hust.soict.globalict.aims.media;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import java.util.ArrayList;

/**
 *
 * @author truongnguyen
 */
public class ShowUtils {

    public static void showOrder(int blank, String s) {
        System.out.print("|");
        int cBlank = blank - s.length();
        if (cBlank % 2 == 0) {
            for (int i = 1; i <= cBlank / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(s);
            for (int i = 1; i <= cBlank / 2; i++) {
                System.out.print(" ");
            }
        } else {
            for (int i = 1; i <= cBlank / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(s);
            for (int i = 1; i <= cBlank / 2 + 1; i++) {
                System.out.print(" ");
            }
        }
        System.out.print("|");
    }
    
    public static void displayColumn(int blanks, String s) {
        if (s == null) {
            s = "";
        }
        int cBlanks = blanks - s.length();
        if (cBlanks % 2 == 0) {
            for (int i = 1; i <= cBlanks / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(s);
            for (int i = 1; i <= cBlanks / 2; i++) {
                System.out.print(" ");
            }
        } else {
            for (int i = 1; i <= cBlanks / 2; i++) {
                System.out.print(" ");
            }
            System.out.print(s);
            for (int i = 1; i <= cBlanks / 2 + 1; i++) {
                System.out.print(" ");
            }
        }
        System.out.print("|");
    }
}
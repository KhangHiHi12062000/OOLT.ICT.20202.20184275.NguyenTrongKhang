package hust.soict.globalict.lab01;
//ex6.3
import java.util.Scanner;

public class DisplayTriangle {
         private static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.printf("Enter height: n = ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
	}
}
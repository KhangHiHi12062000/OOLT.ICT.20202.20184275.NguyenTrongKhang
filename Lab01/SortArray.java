/*Ex6.5
    
    Sorting Array
*/
import java.util.Scanner;
import java.util.Arrays;
public class SortArray{
public static void main(String[] args) {
    
    int sum = 0;    
    double ave = 0;
    int n = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the size of Array: ");
    n = input.nextInt();
    int A[] = new int[n];
    for(int i = 0;i<n;i++){
        A[i] = input.nextInt();
    }
    Arrays.sort(A);
    System.out.println("Sorted numeric array: " + Arrays.toString(A));
    for(int i = 0;i<n;i++){
        sum = sum + A[i];
    }
    ave = (double)sum/(double)n;
    System.out.println("The sum of all elements of Array is : " + sum + " . ");
    System.out.println("The average value of Array is : " + ave + " . ");

    }
}
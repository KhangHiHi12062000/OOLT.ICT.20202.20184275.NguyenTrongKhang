//Ex2.2.6
//SolveEquation
import java.util.Scanner;
import javax.swing.JOptionPane;
public class SolveEquation{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        int a=0,b=0;
        double a11=0,a12=0,a21=0,a22=0,b2=0;
        System.out.println("Do you want to Solve 1 variable or 2 variable??");
        int choice = Integer.parseInt(input.nextLine());
        while(choice != 1 && choice != 2){
            System.err.println("You must to choose 1 or 2 !!!! ");
            choice = Integer.parseInt(input.nextLine());
        }
        
        if(choice==1){
            System.out.print("Enter a = ");
           a = input.nextInt();
           while(a == 0){
            
            System.err.println(" ERROR!!! a can not equal 0!!!");
            System.out.print("Enter a = ");
            a = input.nextInt();
           }
           System.out.print("Enter b = ");
           b = input.nextInt();
           System.out.println("The root of equation is : x = " + -b + "/" + a + " . ");
        }
        if(choice == 2){
            System.out.print("Enter a11 = ");
            a11 = input.nextDouble();
            System.out.print("Enter a12 = ");
            a12 = input.nextDouble();
            System.out.print("Enter a21 = ");
            a21 = input.nextDouble();
            System.out.print("Enter a22 = ");
            a22 = input.nextDouble();
            System.out.print("Enter b2 = ");
            b2 = input.nextDouble();
            double x1 = 0 , x2 = 0;
            x2 = (b2*a21 - b2*a11)/(a12*a21 - a22*a11);
            x1 = (b2-a12*x2)/a11;
            System.out.println("The root of equation is x1 = " + x1 + " , " + " x2 = " + x2 + " . ");
        }
    }
}
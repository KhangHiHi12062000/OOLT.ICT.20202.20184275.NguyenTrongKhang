package hust.soict.globalict.aims.Aims;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.Store.Store;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
       Cart anOrder = new Cart();
       Store St = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA","aaaa","aaaa",1,5.6f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB","bbbb","bbbb",2,5.3f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC","cccc","cccc",3,5f);
	DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD","dddd","dddd",4,7.1f);
	DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE","eeee","eeee",5,3.3f);
	St.addDVD(dvd1);
        St.addDVD(dvd2);
        St.addDVD(dvd3);
        St.addDVD(dvd4);
        St.addDVD(dvd5);
        Scanner scan = new Scanner(System.in);
        int choice1;
        int choice2;
        int choice3;
       do{
           showMenu();
           choice1 = scan.nextInt();
           switch(choice1){
               case 1:
                   do{
                   storeMenu();
                   //choice2 = scan.nextInt();
                   choice2 = scan.nextInt();
                    switch(choice2){
                        case 1:
                            scan.nextLine();
                            //Scanner in = new Scanner(System.in);
                            St.searchByTitle("");
                            System.out.println("Do you want to add DVD(YES 'Y' or NO 'N') ?:");
                            String str = scan.nextLine();
                            switch(str){
                                case "Y":
                                    System.out.println("Enter the ID you want to add to the Cart : ");
                            int s1 = scan.nextInt();
                            if(St.SearchId(s1)!=null){
                                anOrder.addDigitalVideoDisc(St.SearchId(s1));
                            }
                                else{
                                    System.out.println("Can not find this ID!!!");
                                }
                                    
                                    break;
                                case "N":
                                    
                                    break;
                            }
                            
                           break;
                        case 2:
                            St.searchByTitle("");
                            System.out.println("Enter the ID you want to add to the Cart : ");
                            int s1 = scan.nextInt();
                            if(St.SearchId(s1)!=null){
                                anOrder.addDigitalVideoDisc(St.SearchId(s1));
                            }
                            else{
                                System.out.println("Can not find this ID!!!");
                            }
                           break;
                        case 3:
                            anOrder.searchByTitle("");
                           break;
                        case 0:
                           break;    
                    }
                   }while(choice2 != 0);
                   break;
               case 2:
                   scan.nextLine();
                   System.out.println("Do you want to add or remove DVD ?? Answer 'add' or 'remove'");
                   
                   String choice = scan.nextLine();
                   switch(choice){
                       case "add":
                           System.out.println("Enter the information of DVD you want to add : ");
                           System.out.println("Title -> category -> director -> length -> cost");
                         
                           String title = scan.nextLine();
                           String category = scan.nextLine();
                           String director = scan.nextLine();
                           int length = scan.nextInt();
                           float cost = scan.nextFloat();
                           DigitalVideoDisc newdvd = new DigitalVideoDisc(title,category,director,length,cost);
                           St.addDVD(newdvd);
                        break;
                       case "remove":
                           St.searchByTitle("");
                            System.out.println("Enter the ID you want to remove : ");
                            int idRemove = scan.nextInt();
                            if(St.SearchId(idRemove)!=null){
                                St.removeDVD(St.SearchId(idRemove));
                            }
                            else{
                                System.out.println("Can not find this ID!!!");
                            }
                           break;
                   }
               break;
               case 3:
                   scan.nextLine();
                   do{
                       cartMenu();
                       choice3 = scan.nextInt();
                       switch(choice3){
                           case 1:
                               System.out.println("Do you want to filter DVD by title(T) or id(I)");
                               String ans = scan.nextLine();
                               switch(ans){
                                   case "T":
                                       scan.nextLine();
                                       System.out.println("Enter the title you want to search : ");
                                       String title = scan.nextLine();
                                       anOrder.searchByTitle(title);
                                       break;
                                   case "I":
                                       scan.nextLine();
                                       System.out.println("Enter the ID you want to search : ");
                                       int ID = scan.nextInt();
                                       if(anOrder.SearchId(ID)!=null){
                                          anOrder.SearchId(ID).getDetail();
                                       }
                                       break;
                               }
                               break;
                           case 2:
                               System.out.println("Do you want to sort DVD by title(T) or id(I)");
                               String an = scan.nextLine();
                               switch(an){
                                   case "T":
                                       anOrder.sortByTitleCart();
                                       break;
                                   case "I":
                                       anOrder.sortByCostCart();
                                       break;
                               }
                               break;
                           case 3:
                               anOrder.searchByTitle("");
                               System.out.println("Enter the Id of the DVD you want to remove :");
                               int Id = scan.nextInt();
                               if(anOrder.SearchId(Id)!=null){
                                anOrder.removeDigitalVideoDisc(anOrder.SearchId(Id));
                            }
                            else{
                                System.out.println("Can not find this ID!!!");
                            }
                           break;
                           case 4:
                               anOrder.removeAllDVD();
                               System.out.println("An order is created");
                               break;
                           case 0:
                               break;
                       }
                   }while(choice3 != 0);
                   break;
               case 0:
                   break;
           }
       }while(choice1 != 0);
    }
    public static void showMenu() {
        int n = 0;
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        Scanner input = new Scanner(System.in);
        }
        

    public static void cartMenu() {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter DVDs in cart");
            System.out.println("2. Sort DVDs in cart");
            System.out.println("3. Remove DVD from cart");
            System.out.println("4. Place order");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3-4");
        }
    public static void storeMenu() {
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. See a DVD’s details");
            System.out.println("2. Add a DVD to cart");
            System.out.println("3. See current cart");
            System.out.println("0. Exit");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2-3");
        }
}

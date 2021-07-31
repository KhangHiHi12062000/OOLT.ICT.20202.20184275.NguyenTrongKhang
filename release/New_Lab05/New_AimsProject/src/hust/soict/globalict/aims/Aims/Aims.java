package hust.soict.globalict.aims.Aims;

import java.util.Scanner;

import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;
import hust.soict.globalict.store.Store;

public class Aims {
	 public static void main(String[] args) {
	// TODO Auto-generated method stub
     Cart anOrder = new Cart();
     Store store = new Store();
     DigitalVideoDisc dvd1 = new DigitalVideoDisc("AAAA","aaaa","aaaa",1,5.6f);
	 DigitalVideoDisc dvd2 = new DigitalVideoDisc("BBBB","bbbb","bbbb",2,5.3f);
	 DigitalVideoDisc dvd3 = new DigitalVideoDisc("CCCC","cccc","cccc",3,5f);
	 DigitalVideoDisc dvd4 = new DigitalVideoDisc("DDDD","dddd","dddd",4,7.1f);
	 DigitalVideoDisc dvd5 = new DigitalVideoDisc("EEEE","eeee","eeee",5,3.3f);
	 store.addDVD(dvd1);
	 store.addDVD(dvd2);
	 store.addDVD(dvd3);
	 store.addDVD(dvd4);
	 store.addDVD(dvd5);
     Scanner input = new Scanner(System.in);
     int choose,choose1,choose2,choose3;
     do {
    	 showMenu();
    	choose1 = input.nextInt();
     	switch(choose1) {
     	 	case 1:
     	 		store.PrintCurrentStore();
     	 		do {
     	 		storeMenu();
     	 		choose2 = input.nextInt();
     	 		switch(choose2) {
	     	 			case 1:
	     	 				input.nextLine();
	     	 				store.PrintCurrentStore();
	     	 				
	     	 				System.out.println("Enter title of the DVD you want to see the detail : ");
	     	 				int choose4 = input.nextInt();
	     	 				while(choose4 > store.getQtyOrdered()) {
	         	 					System.out.println("Can not find this ID!!!Enter ID again please!!");
	         	 					choose4 = input.nextInt();
	     	 				}
	     	 				System.out.println(store.getItemsInStore()[choose4-1].toString());
	     	 				System.out.println("Do you want to add this DVD to the cart (Y/N)?");
	     	 				input.nextLine();
	     	 				String str = input.nextLine();
	     	 				switch(str) {
	     	 				    case "Y":
	     	 				    case "y":
	     	 					anOrder.addDigitalVideoDisc(store.getItemsInStore()[choose4]);
	     	 						break;
	     	 				    case "N":
	     	 				    case "n":
	     	 				    	break;
	     	 				}
	     	 				
	     	 				break;
	     	 			case 2:
	     	 				input.nextLine();
	     	 				store.PrintCurrentStore();
	     	 				
	     	 				System.out.println("Enter id of the DVD you want add : ");
	     	 				int choose5 = input.nextInt();
	     	 				while(choose5 > store.getQtyOrdered()) {
         	 					System.out.println("Can not find this ID!!!Enter ID again please!!");
         	 					choose5 = input.nextInt();
     	 				}
	     	 				System.out.println(store.getItemsInStore()[choose5-1].toString());
	     	 				System.out.println("Do you want to add this DVD to the cart (Y/N)?");
	     	 				input.nextLine();
	     	 				String str1 = input.nextLine();
	     	 				switch(str1) {
	     	 				    case "Y":
		     	 				    case "y":
		     	 					anOrder.addDigitalVideoDisc(store.getItemsInStore()[choose5]);
		     	 						break;
		     	 				    case "N":
		     	 				    case "n":
		     	 				    	break;
		     	 				}
		     	 				break;
		     	 			case 3:
		     	 				anOrder.PrintCurrentCart();
		     	 				do {
		     	 					cartMenu();
		     	 			    	choose = input.nextInt();
		     	 			    	switch(choose) {
		     	 				case 1:
		                            System.out.println("Do you want to filter DVD by title(T) or id(I)");
		                            String ans = input.nextLine();
		                            switch(ans){
		                                case "T":
		                                    input.nextLine();
		                                    System.out.println("Enter the title you want to search : ");
		                                    String title = input.nextLine();
		                                    	System.out.println(anOrder.SearchByTitle(title));
		                                    break;
		                                case "I":
		                                    input.nextLine();
		                                    System.out.println("Enter the ID you want to search : ");
		                                    int ID = input.nextInt();
		                                       System.out.println(anOrder.searchByID(ID));
		  
		                                    break;
		                            }
		                            break;
		                        case 2:
		                            System.out.println("Do you want to sort DVD by title(T) or id(I)");
		                            String an = input.nextLine();
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
		                            System.out.println("Enter the Id of the DVD you want to remove :");
		                            int Id = input.nextInt();
		                            while(Id > anOrder.getQtyOrdered()) {
			         	 					System.out.println("Can not find this ID!!!Enter ID again please!!");
			         	 					Id = input.nextInt();
			     	 				};
			     	 				anOrder.removeDigitalVideoDisc(anOrder.getItemsOrdered()[Id - 1]);
		                        break;
		                        case 4:
		                            anOrder.removeAllDVD();
		                            System.out.println("An order is created");
		                            break;
		                        case 0:
		                            break;}
		     	 				}while(choose != 0);
     	 				break;
     	 			case 0:
     	 				break;
     	 		}
     	 		}while(choose2 != 0);
     	 		break;
     	 	case 2:
     	 		input.nextLine();
     	 		System.out.println("Do you want to add DVD or remove DVD in the store (Add/Remove)?");
     	 		String str2 = input.nextLine();
     	 		switch(str2) {
				    case "add":
				    case "Add":
				    	System.out.println("Enter the information of DVD you want to add : ");
                        System.out.println("Title -> category -> director -> length -> cost");
                      
                        String title = input.nextLine();
                        String category = input.nextLine();
                        String director = input.nextLine();
                        int length = input.nextInt();
                        float cost = input.nextFloat();
                        DigitalVideoDisc newdvd = new DigitalVideoDisc(title,category,director,length,cost);
                        store.addDVD(newdvd);
						break;
				    case "Remove":
				    case "remove":
				    	store.PrintCurrentStore();
				    	System.out.println("Enter Id of the DVD you want to remove:");
				    	int choose6 = input.nextInt();
				    	store.removeDVD(store.getItemsInStore()[choose6-1]);
				    	break;
				}
     	 		break;
     	 	case 3:
     	 		anOrder.PrintCurrentCart();
     	 		do {
	 					cartMenu();
	 			    	choose = input.nextInt();
	 			    	switch(choose) {
	 				case 1:
                    System.out.println("Do you want to filter DVD by title(T) or id(I)");
                    String ans = input.nextLine();
                    switch(ans){
                        case "T":
                            input.nextLine();
                            System.out.println("Enter the title you want to search : ");
                            String title = input.nextLine();
                            	System.out.println(anOrder.SearchByTitle(title));
                            break;
                        case "I":
                            input.nextLine();
                            System.out.println("Enter the ID you want to search : ");
                            int ID = input.nextInt();
                               System.out.println(anOrder.searchByID(ID));

                            break;
                    }
                    break;
                case 2:
                    System.out.println("Do you want to sort DVD by title(T) or id(I)");
                    String an = input.nextLine();
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
                    System.out.println("Enter the Id of the DVD you want to remove :");
                    int Id = input.nextInt();
                    while(Id > anOrder.getQtyOrdered()) {
     	 					System.out.println("Can not find this ID!!!Enter ID again please!!");
     	 					Id = input.nextInt();
 	 				};
 	 				anOrder.removeDigitalVideoDisc(anOrder.getItemsOrdered()[Id - 1]);
                break;
                case 4:
                    anOrder.removeAllDVD();
                    System.out.println("An order is created");
                    break;
                case 0:
                    break;}
	 				}while(choose != 0);
     	 		break;
     	 	case 0:
     	 		break;
     	}
     }while(choose1 != 0);
	 }
	 public static void showMenu() {
		 System.out.println("AIMS: ");
		 System.out.println("--------------------------------");
		 System.out.println("1. View store");
		 System.out.println("2. Update store");
		 System.out.println("3. See current cart");
		 System.out.println("0. Exit");
		 System.out.println("--------------------------------");
		 System.out.println("Please choose a number: 0-1-2-3");
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
}

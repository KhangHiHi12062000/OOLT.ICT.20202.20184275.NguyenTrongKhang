package hust.soict.globalict.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
	public static final int MAX_NUMBERS_ORDERED=100;
    private DigitalVideoDisc [] itemsInStore = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private static int qtyOrdered = 0;
    
    public Store() {
	}
	public void addDVD(DigitalVideoDisc disc) {
    	if(qtyOrdered > 100) {
    		System.out.println("The store is almost full");
    	}
    	else {
    		this.itemsInStore[qtyOrdered] = disc;
    		System.out.println("Add DVD to store successfully!!");
            qtyOrdered++;
        }
    }
    public DigitalVideoDisc[] getItemsInStore() {
		return itemsInStore;
	}
	public void setItemsInStore(DigitalVideoDisc[] itemsInStore) {
		this.itemsInStore = itemsInStore;
	}
	public static int getQtyOrdered() {
		return qtyOrdered;
	}
	public static void setQtyOrdered(int qtyOrdered) {
		Store.qtyOrdered = qtyOrdered;
	}
	public void removeDVD(DigitalVideoDisc disc) {
    	int position = -1;
        for(int i = 0;i <= qtyOrdered-1 ; i++){
        	if(itemsInStore[i]==disc) {
				 position = i;
				 break;
        	}
        }
        for(int i = position; i < qtyOrdered; i++) {
        	itemsInStore[i] = itemsInStore[i+1];
        }
        itemsInStore[qtyOrdered - 1] = null;
        System.out.println("The disc have been removed");
        qtyOrdered--;
    }
    public void PrintCurrentStore() {
    	System.out.println("*****************CART*******************");
		System.out.println("Ordered Items");
		System.out.println("__________________________________________");
		System.out.println("|  id  | TT  | Cate |  Direct |lth| cost $| ");
		System.out.println("|______|_____|______|_________|___|_______|");
		for(int i=0; i< qtyOrdered;i++) {
			System.out.println(itemsInStore[i].getDetail());
		System.out.println("|______|_____|______|_________|___|_______|");
		}
		System.out.println("****************************************");
    }
    public String SearchByTitle(String title) {
        for(int i=0;i < qtyOrdered ; i++){
            if(itemsInStore[i].search(title)){
                return itemsInStore[i].toString();
            }
        }
        return "Cannot find title !!";
    }
}

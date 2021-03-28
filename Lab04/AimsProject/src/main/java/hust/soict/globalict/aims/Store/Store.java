
package hust.soict.globalict.aims.Store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Store {
    public static final int N=20;
    private DigitalVideoDisc [] itemsInStore = new DigitalVideoDisc[N];
    int qtyOrdered() {
		int count =0;
		for(DigitalVideoDisc item : itemsInStore) {
			if (item != null) {
				count++;
			}

		}
		return count;
	}
	public void addDVD(DigitalVideoDisc disc) {
		if(qtyOrdered()>=20) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsInStore[qtyOrdered()]=disc;
			System.out.println("The disc've been added");
		}
	}
        public void removeDVD(DigitalVideoDisc disc) {
		int position=-1;
		for(int i=0; i<qtyOrdered(); i++) {
			if(itemsInStore[i]==disc) {
				 position = i;
				 break;
			}
		}
		for(int i=position;i<qtyOrdered()-1;i++) {
			itemsInStore[i]=itemsInStore[i+1];
		}
		itemsInStore[qtyOrdered()-1]=null;
		System.out.println("The disc have been removed");
	}
       public void searchByTitle(String title) {
        int number = -1;
        for(int i=0;i<qtyOrdered();i++){
            if(itemsInStore[i].search(title)){
                number = i;
                System.out.println(itemsInStore[number].getDetail());
            }
        }
        if(number == -1){
            System.out.println("Can not find DVD!!!");
        }
    }
       public DigitalVideoDisc SearchId(int id){
            for(int i=0;i<qtyOrdered();i++){
                if(itemsInStore[i].getId()==id){
                    return itemsInStore[i];
                }
            }
            return null;
        }
    
}

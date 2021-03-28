
public class Cart {
	public static final int N=20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[N];
	int qtyOrdered() {
		int count =0;
		for(DigitalVideoDisc item : itemsOrdered) {
			if (item != null) {
				count++;
			}

		}
		return count;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered()>=20) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[qtyOrdered()]=disc;
			System.out.println("The disc've been added");
		}
	}
    public float totalCost() {
		float tCost=0;
		for(int i=0; i< qtyOrdered(); i++) {
			tCost += itemsOrdered[i].getCost();
		}
		return tCost;
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int position=-1;
		for(int i=0; i<qtyOrdered(); i++) {
			if(itemsOrdered[i]==disc) {
				 position = i;
				 break;
			}
		}
		for(int i=position;i<qtyOrdered()-1;i++) {
			itemsOrdered[i]=itemsOrdered[i+1];
		}
		itemsOrdered[qtyOrdered()-1]=null;
		System.out.println("The disc have been removed");
	}

	public void printAll() {
		for(int i=0; i<qtyOrdered(); i++) {
			System.out.println(itemsOrdered[i].getTitle());
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
		if(qtyOrdered()+dvdList.length>=20) {
			System.out.println("The cart is almost full");
		}
		else{
			for(int i=qtyOrdered(); i< qtyOrdered()+dvdList.length;i++) {
				itemsOrdered[i]= dvdList[i-qtyOrdered()];
			}
			System.out.println("The disc've been added");
		}
		}
		
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
		if(qtyOrdered()+2>=20) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[qtyOrdered()]=dvd1;
			itemsOrdered[qtyOrdered()]=dvd2;
			System.out.println("The disc've been added");
		}
	}
	public void sortByCostCart() {
		DigitalVideoDisc[] sort = itemsOrdered;
		for(int i=0; i<  qtyOrdered()-1; i++) {
			for(int j=i+1; j< qtyOrdered();j++) {
				if(sort[i].getCost()<sort[j].getCost()) {
					DigitalVideoDisc dvd = sort[i];
					sort[i]=sort[j];
					sort[j]= dvd;
				}
			}
		}
		System.out.println("*****************CART*******************");
		System.out.println("Ordered Items");
		for(int i=0; i< qtyOrdered();i++) {
			System.out.println(i+1+". "+sort[i].getDetail());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("****************************************");
	}
	public void sortByTitleCart() {
		DigitalVideoDisc[] sort = itemsOrdered;
		for(int i=0; i<  qtyOrdered()-1; i++) {
			for(int j=i+1; j< qtyOrdered();j++) {
				int string = sort[i].getTitle().compareTo(sort[j].getTitle());
				if(string<0){
					DigitalVideoDisc dvd = sort[i];
					sort[i]=sort[j];
					sort[j]= dvd;
				}
			}
		}
		System.out.println("*****************CART*******************");
		System.out.println("Ordered Items");
		for(int i=0; i< qtyOrdered();i++) {
			System.out.println(i+1+". "+sort[i].getDetail());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("****************************************");
	}
	public void sortByLengthCart() {
		DigitalVideoDisc[] sort = itemsOrdered;
		for(int i=0; i<  qtyOrdered()-1; i++) {
			for(int j=i+1; j< qtyOrdered();j++) {
				if(sort[i].getLength()<sort[j].getLength()) {
					DigitalVideoDisc dvd = sort[i];
					sort[i]=sort[j];
					sort[j]= dvd;
				}
			}
		}
		System.out.println("*****************CART*******************");
		System.out.println("Ordered Items");
		for(int i=0; i< qtyOrdered();i++) {
			System.out.println(i+1+". "+sort[i].getDetail());
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("****************************************");
	}
        public void searchByTitle(String title){
            int number = -1;
            for(int i=0;i < qtyOrdered() ; i++){
                if(itemsOrdered[i].search(title)){
                     number = i;                    
                    System.out.println(itemsOrdered[number].getDetail());
                }
                if(number == -1){
                    System.out.println("Cannot find title.");
                }
            }
        }
	public void searchByID(int id) {
		int number = -1;
		for(int i=0; i<  qtyOrdered(); i++) {
			if(itemsOrdered[i].getId() == id) {
				 number = i;
				 break;			}
		}
		if(number == -1) {
			System.out.println("Cannot found id.");
		}else {
			System.out.println(itemsOrdered[number].getDetail());
		}
	}
        
    
}
package hust.soict.globalict.aims.cart.Cart;



import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private static int qtyOrdered = 0;
    
    public Cart() {

	}
	public void addDigitalVideoDisc(DigitalVideoDisc  Disc){
    	if(qtyOrdered > 20) {
    		System.out.println("The cart is almost full");
    	}
    	else {
    		this.itemsOrdered[qtyOrdered] = Disc;
    		System.out.println("Add the DVD to cart successfully!");
            qtyOrdered++;
        }
    }
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
		if(qtyOrdered + dvdList.length> 20) {
    		System.out.println("The cart is almost full");
    	}
    	else {
    		for(int i=qtyOrdered; i< qtyOrdered+dvdList.length;i++) {
				itemsOrdered[i]= dvdList[i-qtyOrdered];
			}
            qtyOrdered = qtyOrdered + dvdList.length;
        }
	}
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
		if(qtyOrdered + 2>=20) {
			System.out.println("The cart is almost full");
		}
		else {
			itemsOrdered[qtyOrdered]=dvd1;
			itemsOrdered[qtyOrdered]=dvd2;
			System.out.println("The disc've been added");
			qtyOrdered = qtyOrdered + 2;
		}
	}
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
    	int position = -1;
            for(int i = 0;i <= qtyOrdered-1 ; i++){
            	if(itemsOrdered[i]==disc) {
   				 position = i;
   				 break;
            	}
            }
            for(int i = position; i < qtyOrdered; i++) {
            	itemsOrdered[i] = itemsOrdered[i+1];
            }
            itemsOrdered[qtyOrdered - 1] = null;
            System.out.println("The disc have been removed");
            qtyOrdered--;
    }
    public float totalCost(){
        float sum = 0;
        for(int i = 0 ; i <= qtyOrdered - 1; i++){
            sum = sum + itemsOrdered[i].getCost();
        }
        return sum;
    }
    public void printAll() {
    	for(int i = 0; i < qtyOrdered ; i++) {
    		System.out.println(itemsOrdered[i].toString());
    	}
    }
	public void sortByCostCart() {
		// TODO Auto-generated method stub
		for(int i=0; i<  qtyOrdered-1; i++) {
			for(int j=i+1; j< qtyOrdered; j++) {
				if(itemsOrdered[i].getCost()<itemsOrdered[j].getCost()) {
					DigitalVideoDisc tmp = itemsOrdered[i];
					itemsOrdered[i]=itemsOrdered[j];
					itemsOrdered[j]= tmp;
				}
			}
		}
		PrintCurrentCart();
	}
	public void sortByTitleCart() {
		// TODO Auto-generated method stub
		for(int i=0; i<  qtyOrdered-1; i++) {
			for(int j=i+1; j< qtyOrdered;j++) {
				if(itemsOrdered[i].getTitle().compareTo(itemsOrdered[j].getTitle()) < 0){
					DigitalVideoDisc tmp = itemsOrdered[i];
					itemsOrdered[i]=itemsOrdered[j];
					itemsOrdered[j]= tmp;
				}
			}
		}
		PrintCurrentCart();
	}
	public void sortByLengthCart() {
		// TODO Auto-generated method stub
		for(int i=0; i<  qtyOrdered-1; i++) {
			for(int j=i+1; j< qtyOrdered;j++) {
				if(itemsOrdered[i].getLength()<itemsOrdered[j].getLength()) {
					DigitalVideoDisc tmp = itemsOrdered[i];
					itemsOrdered[i]=itemsOrdered[j];
					itemsOrdered[j]= tmp;
				}
			}
		}
		PrintCurrentCart();
	}
	public String searchByID(int id) {
		// TODO Auto-generated method stub
		for(int i=0; i<  qtyOrdered; i++) {
			if(itemsOrdered[i].getId() == id) {
				return itemsOrdered[i].toString();		
			}
		}
		return "Cannot found id!!";
	}
    public void PrintCurrentCart() {
    	System.out.println("*****************CART************************");
		System.out.println("Ordered Items");
		System.out.println("_______________________________________________");
		System.out.println("|id | idST | TT  | Cate |  Direct |lth| cost $| ");
		System.out.println("|___|______|_____|______|_________|___|_______|");
		for(int i=0; i< qtyOrdered;i++) {
			System.out.println("| "+(i+1)+" "+itemsOrdered[i].getDetail());
		System.out.println("|___|______|_____|______|_________|___|_______|");
		}
		System.out.println("Total cost: " + totalCost());
		System.out.println("****************************************");
    }
    public String SearchByTitle(String title) {
        for(int i=0;i < qtyOrdered ; i++){
            if(itemsOrdered[i].search(title)){
                return itemsOrdered[i].toString();
            }
        }
        return "Cannot find title !!";
    }
	public DigitalVideoDisc[] getItemsOrdered() {
		return itemsOrdered;
	}
	public void setItemsOrdered(DigitalVideoDisc[] itemsOrdered) {
		this.itemsOrdered = itemsOrdered;
	}
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public static void setQtyOrdered(int qtyOrdered) {
		Cart.qtyOrdered = qtyOrdered;
	}
	public static int getMaxNumbersOrdered() {
		return MAX_NUMBERS_ORDERED;
	}
	public void removeAllDVD() {
		// TODO Auto-generated method stub
		for(int i=0;i<qtyOrdered;i++){
            this.removeDigitalVideoDisc(itemsOrdered[i]);
        }
	}
	
}

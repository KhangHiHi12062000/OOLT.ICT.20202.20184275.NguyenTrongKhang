
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private static int qtyOdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc  Disc){
            this.itemsOdered[qtyOdered] = Disc;
            this.itemsOdered[qtyOdered].print();
            qtyOdered++;
            
    }
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
            for(int i=0;i<=qtyOdered-1;i++){
                if(disc.getTitle().equals(this.itemsOdered[i].getTitle())){
                    System.out.println("REMOVED " + disc.getTitle());
                    this.itemsOdered[i].setTitle(null);
                    this.itemsOdered[i].setCategory(null);
                    this.itemsOdered[i].setDirector(null);
                    this.itemsOdered[i].setLength(0);
                    this.itemsOdered[i].setCost(0);
                    
                }
            }
           
    }
    public void totalCost(){
        float sum = 0;
        for(int i = 0 ; i <= qtyOdered - 1; i++){
            sum = sum + itemsOdered[i].getCost();
        }
        System.out.println("Total Cost : " + sum);
    }
            
}

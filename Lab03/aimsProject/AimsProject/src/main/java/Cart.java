
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private static int qtyOdered = 0;
    public void addDigitalVideoDisc(DigitalVideoDisc Disc){
            this.itemsOdered[qtyOdered] = Disc;
            this.itemsOdered[qtyOdered].print();
            qtyOdered++;
       }
    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList){
        if(dvdList.length>20){
            System.out.println("You can add more than 20 DVDS");
        }
        else{
        for(int i=0;i<=dvdList.length-1;i++){
            addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
        }
        }
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
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2){
            this.itemsOdered[qtyOdered] = dvd1;
            this.itemsOdered[qtyOdered].print();
            this.itemsOdered[qtyOdered] = dvd2;
            this.itemsOdered[qtyOdered].print();
            qtyOdered += 2;
    }
    public void totalCost(){
        float sum = 0;
        for(int i = 0 ; i <= qtyOdered - 1; i++){
            sum = sum + itemsOdered[i].getCost();
        }
        System.out.println("Total Cost : " + sum);
    }

    void addDigitalVideoDisc(DigitalVideoDisc Div1, DigitalVideoDisc Div2, DigitalVideoDisc Div3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
            
}

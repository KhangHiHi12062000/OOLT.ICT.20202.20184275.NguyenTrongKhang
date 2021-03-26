package hust.soict.globalict.aims.Aims;
import hust.soict.globalict.aims.cart.Cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc.DigitalVideoDisc;

public class Aims {
    public static void main(String[] args) {
       // TODO Auto-generated method stub
       Cart anOrder = new Cart();
       //Add DVD
        DigitalVideoDisc Div1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87, (float) 19.95);
        DigitalVideoDisc Div2 = new DigitalVideoDisc("Star Wars","Science","George Lucas",87, (float) 24.95);
        DigitalVideoDisc Div3 = new DigitalVideoDisc("Aladin","Animation","",0, (float) 18.99);
        anOrder.addDigitalVideoDisc(Div1);
        anOrder.addDigitalVideoDisc(Div2);
        anOrder.addDigitalVideoDisc(Div3);
        anOrder.removeDigitalVideoDisc(Div3);
        System.out.println("Total cost : " + anOrder.totalCost());

        
    }
}

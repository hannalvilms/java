package BurgerPackage;

public class BurgeriLisandid extends Lisandid {


    public BurgeriLisandid(String lisand1, String lisand2, String lisand3, String lisand4, double lisand1hind, double lisand2hind, double lisand3hind, double lisand4hind){
        this.lisand1 = lisand1;
        this.lisand2 = lisand2;
        this.lisand3 = lisand3;
        this.lisand4 = lisand4;
        this.lisand1hind = lisand1hind;
        this.lisand2hind = lisand2hind;
        this.lisand3hind = lisand3hind;
        this.lisand4hind = lisand4hind;
    }

    public String toString() {
        System.out.println("Lisandid: ");
        return  lisand1 + " - " + lisand1hind + " €" + ", " +
                lisand2 + " - " + lisand2hind + " €" + ", " +
                lisand3 + " - " + lisand3hind + " €" + ", " +
                lisand4 + " - " + lisand4hind + " €";
    }
}

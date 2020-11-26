package BurgerPackage;

public class Menu {

    int järjeNr;
    String burger;
    String koostis;
    double hind;

    public Menu(int järjeNr, String burger, String koostis, double hind){
        this.järjeNr = järjeNr;
        this.burger = burger;
        this.koostis = koostis;
        this.hind = hind;
    }

    @Override
    public String toString() {
        return this.järjeNr + " " +  this.burger + " - " + this.koostis + " " + this.hind + " €";
    }
}

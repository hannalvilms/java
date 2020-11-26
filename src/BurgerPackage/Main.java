package BurgerPackage;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Burgerid
        ArrayList<Menu> menu = new ArrayList<>();
        menu.add(new Menu(1, "Chicken Burger", "kanaliha, valge sai", 3.0));
        menu.add(new Menu(2, "Old Fashioned Cheeseburger","loomaliha, valge sai",  5.0));
        menu.add(new Menu(3, "New York Burger", "sealiha, teraleib", 6.5));

        //Burgeri lisandid
        ArrayList<Lisandid> ChickenBurgerLisandid = new ArrayList<Lisandid>();
        ChickenBurgerLisandid.add(new BurgeriLisandid("juust", "salat", "tomat", "majonees", 1,1,1,1));

        ArrayList<Lisandid> CheeseburgerLisandid = new ArrayList<Lisandid>();
        CheeseburgerLisandid.add(new BurgeriLisandid("peekon", "kurk", "sibul", "peekonikaste", 1,1,1,1));

        ArrayList<Lisandid> NewYorkBurgerLisandid = new ArrayList<Lisandid>();
        NewYorkBurgerLisandid.add(new BurgeriLisandid("ananass", "tomat", "kurk", "sibul", 1,1,1,1));


        double hindKokku = 0;

        //Menüü
        while(true) {
            Scanner menüü = new Scanner(System.in);
            Scanner veelBurgereid = new Scanner(System.in);

            for (Menu menuItem : menu) {
                System.out.println(menuItem.toString());
            }

            System.out.println("Vali burgeri number (Väljumiseks vajuta 0): ");
            int valitudBurger = menüü.nextInt();

            //Kanaburger
            if(valitudBurger  == 1) {

                Burger chickenBurger = new Burger("Chicken Burger", "kanaliha", "valge sai", 3.0);

                for (Lisandid lisandid : ChickenBurgerLisandid) {
                    System.out.println(lisandid);
                }
                chickenBurger.valiLisandid();
                System.out.println();

                hindKokku += chickenBurger.arvutaHind();
                System.out.println("Burgeri hind: " + chickenBurger.arvutaHind());

                System.out.println("Kas soovid veel burgereid? (jah/ei)");
                veelBurgereid.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }

            //Juustuburger
            else if(valitudBurger == 2) {

                Burger cheeseBurger = new Burger("Old Fashioned Cheeseburger", "loomaliha", "valge sai", 5.0);

                for (Lisandid lisandid : CheeseburgerLisandid) {
                    System.out.println(lisandid);
                }
                cheeseBurger.valiLisandid();

                hindKokku += cheeseBurger.arvutaHind();
                System.out.println("Burgeri hind: " + cheeseBurger.arvutaHind());

                System.out.println("Kas soovid veel burgereid? (jah/ei)");
                veelBurgereid.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }

            //New York Burger
            else if(valitudBurger == 3) {

                Burger newYorkBurger = new Burger("New York Burger", "sealiha", 6.5); //loodud teraleivaga

                for (Lisandid lisandid : NewYorkBurgerLisandid) {
                    System.out.println(lisandid);
                }
                newYorkBurger.valiLisandid();

                hindKokku += newYorkBurger.arvutaHind();
                System.out.println("Burgeri hind: " + newYorkBurger.arvutaHind());

                System.out.println("Kas soovid veel burgereid? (jah/ei)");
                veelBurgereid.nextLine();
                if(veelBurgereid.equals("ei")) {
                    break;
                }
            }
            else break;
        }
        System.out.println("Arve kokku: " + hindKokku + " €");
    }
}
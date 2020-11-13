import java.util.*;

public class Menu {
    private ArrayList<Burger> burgers = new ArrayList<>();

    public Burger valiBurger(int number) {
        return burgers.get(number - 1);
    }

    public ArrayList<Burger> burgeriValik() {
        return this.burgers;
    }

    public void lisaValikusse(Burger burger) {
        burgers.add(burger);
    }

}
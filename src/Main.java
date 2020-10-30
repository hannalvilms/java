import java.util.*;

public class Main {

    public static void main(String[] args) {
            Menu menu = new Menu();

            menu.addMeal("hamburger");
            menu.addMeal("hamburger");
            menu.addMeal("fish n chips");

            menu.printMeals();

            menu.clearMenu();
    }
}


import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        int lisanditeArv = 0;
        double summa = 0;

        //burgerid
        Burger chickenBurger = new Burger("Chicken Burger", "kana", "valge sai", 3.00);
        Burger oldFashionedCheeseburger = new Burger("Old Fashioned Cheeseburger", "loomaliha", "valge sai", 5.00);
        Burger newYorkBurger = new Burger("New York Burger", "sealiha", "teraleib", 6.50);

        //lisandid
        chickenBurger.addExtras("juust", 1.5, "salat", 0.5, "tomat", 0.5, "majonees", 1.0);
        oldFashionedCheeseburger.addExtras("peekon", 1.5, "kurk", 0.5, "sibul", 0.5, "peekoni kaste", 1.2);
        newYorkBurger.addExtras("ananass", 1.0, "tomat", 0.5, "kurk", 0.5, "sibul", 0.5);

        Menu burgersMenu = new Menu();

        // lisame burgerid menüüvalikusse
        burgersMenu.lisaValikusse(chickenBurger);
        burgersMenu.lisaValikusse(oldFashionedCheeseburger);
        burgersMenu.lisaValikusse(newYorkBurger);

        ArrayList<Burger> burgers = new ArrayList<>();
        int nrInQueue = 1;
        for (Burger burger : burgersMenu.burgeriValik()) {
            System.out.println(nrInQueue + ". " + burger.burgerNimi() + ": " + burger.burgerLiha() + ", " + burger.burgerSai());
            nrInQueue++;
        }

        while (true) {
            System.out.println("Vali burger (Vajuta väljumiseks 0): ");
            int valitudBurger = Integer.parseInt(input.nextLine());
            if (valitudBurger == 0) {
                break;
            }

            Burger customersBurgers = burgersMenu.valiBurger((valitudBurger));
            burgers.add(customersBurgers);
            customersBurgers.burgeriteLisandid();

            while (true) {
                System.out.println("Vali burgerile lisandid (Väljumiseks vajuta Enter): ");
                String lisand = reader.nextLine();

                if (lisand.isEmpty()) {
                    break;
                }

                customersBurgers.valiLisandid(lisand);

                if (customersBurgers.lisandiNimi1().equals(lisand)) {
                    customersBurgers.liidaHinnad(customersBurgers.lisandiHind1());
                } else if (customersBurgers.lisandiNimi2().equals(lisand)) {
                    customersBurgers.liidaHinnad(customersBurgers.lisandiHind2());
                } else if (customersBurgers.lisandiNimi3().equals(lisand)) {
                    customersBurgers.liidaHinnad(customersBurgers.lisandiHind3());
                } else if (customersBurgers.lisandiNimi4().equals(lisand)) {
                    customersBurgers.liidaHinnad(customersBurgers.lisandiHind4());
                }
            }

            System.out.println();

            summa = summa + customersBurgers.koostaBurger();
            lisanditeArv = lisanditeArv + customersBurgers.lisanditeArv();

            System.out.println("Hetkel maksta: " + summa + ". Lisandeid kokku: " + lisanditeArv);
        }

        //Esita arve
        System.out.println("Arve:");

        for (Burger burger : burgers) {
            System.out.println(burger.burgerNimi() + ": " + burger.burgerHind());
        }

        System.out.println("Maksta: " + summa);
    }
}



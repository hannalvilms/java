package BurgerPackage;

import java.util.*;

public class Burger {

    //Encapsulation
    private String nimi;
    private String liha;
    private String sai;
    private double hind;

    ArrayList<String> lisandid = new ArrayList<String>();

    private double lisandHind = 1.0;
    int lisandeidKokku = 0;

    public Burger(String nimi, String liha, String sai, double hind) {
        this.nimi = nimi;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
    }

    //Teraleivaga burger
    public Burger(String nimi, String liha, double hind) {
        this.nimi = nimi;
        this.liha = liha;
        this.hind = hind;
        this.sai = "teraleib";
    }

    //Lisandite valimine
    public void valiLisandid() {
        Scanner scanner = new Scanner(System.in);

        while(lisandeidKokku < 20) {
            System.out.println("Sisesta lisandid (Väljumiseks vajuta enter): ");
            String lisand = scanner.nextLine();

            if(lisand.isEmpty()) {
                break;
            }
            else lisandid.add(lisand);
            lisandeidKokku++;
        }

        System.out.println("Valitud lisandid: ");
        for(String lisand : lisandid) {
            System.out.println(lisand);
        }
    }

    //Hinna arvutus
    public double arvutaHind() {
        return this.hind + (lisandeidKokku * lisandHind);
    }
}

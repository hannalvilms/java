import java.util.*;

public class Burger {
    private String nimi;
    private String liha;
    private String sai;
    private double hind;

    private String lisand1;
    private double lisand1Hind;
    private String lisand2;
    private double lisand2Hind;
    private String lisand3;
    private double lisand3Hind;
    private String lisand4;
    private double lisand4Hind;

    private ArrayList<String> valitudLisandid;
    private int lisandiNumber;

    public void addExtras(String lisand1, double lisand1Hind, String lisand2, double lisand2Hind, String lisand3, double lisand3Hind, String lisand4, double liasnd4Hind) {
        this.lisand1 = lisand1;
        this.lisand2 = lisand2;
        this.lisand3 = lisand3;
        this.lisand4 = lisand4;
        this.lisand1Hind = lisand1Hind;
        this.lisand2Hind = lisand2Hind;
        this.lisand3Hind = lisand3Hind;
        this.lisand4Hind = liasnd4Hind;
    }

    public Burger(String nimi, String liha, String sai, double hind) {
        this.nimi = nimi;
        this.liha = liha;
        this.sai = sai;
        this.hind = hind;
        this.valitudLisandid = new ArrayList<>();
        this.lisandiNumber = 0;
    }
    public String burgerNimi() {
        return this.nimi;
    }
    public String burgerLiha() {
        return this.liha;
    }
    public String burgerSai() {
        return this.sai;
    }
    public double burgerHind() {
        return this.hind;
    }
    public String lisandiNimi1(){
        return this.lisand1;
    }
    public String lisandiNimi2(){
        return this.lisand2;
    }
    public String lisandiNimi3(){
        return this.lisand3;
    }
    public String lisandiNimi4(){
        return this.lisand4;
    }
    public double lisandiHind1() {
        return this.lisand1Hind;
    }
    public double lisandiHind2() {
        return this.lisand2Hind;
    }
    public double lisandiHind3() {
        return this.lisand3Hind;
    }
    public double lisandiHind4() {
        return this.lisand4Hind;
    }
    public void burgeriteLisandid() {
        System.out.println("Vali lisandid: " + this.lisand1 + ", " + this.lisand2 + ", " + this.lisand3 + ", " + this.lisand4);
    }
    public int lisanditeArv() {
        return this.lisandiNumber;
    }
    public void valiLisandid(String extra) {
        this.lisandiNumber++;
        valitudLisandid.add(extra);
    }

    public void liidaHinnad(double amount) {
        this.hind = this.hind + amount;
    }

    public double koostaBurger() {
        return this.hind;
    }
}
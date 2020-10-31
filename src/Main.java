import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
    }
}



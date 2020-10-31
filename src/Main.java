import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        Person david = new Person("Pekka", 15, 9, 1999);
        Person jeva = new Person("Steve", 1, 10, 2016);

        System.out.println( david.getName() + " age " + david.age() + " years");
        System.out.println( jeva.getName() + " age " + jeva.age() + " years");
    }
}




import java.util.*;

public class Main {

    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        list.add("Tere");
        list.add("Ciao");
        list.add("Hello");

        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));
    }
}


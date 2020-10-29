import java.util.*;

public class Main {

    public static void removeLast(ArrayList<String> list){
        int indexOfLast = list.size()-1;
        list.remove(indexOfLast);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        list.add("Mati");
        list.add("Kati");
        list.add("Tõnu");
        list.add("Liis");

        System.out.println("Inimesed: ");
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        removeLast(list);
        System.out.println(list);
    }
}


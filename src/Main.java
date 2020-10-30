import java.util.*;

public class Main {

    public static void smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for (Integer number : list2) {
            if (!list1.contains(number)) {
                list1.add(number);
            }
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        Collections.addAll(list1, 1, 2, 3, 2, 4);
        Collections.addAll(list2, 3, 4, 5);

        smartCombine(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
    }

}


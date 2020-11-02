import java.util.*;

public class Main {

    public static void main(String[] args) {

        int number = 10;

        for (int row = 0; row < number; row++) {

            for (int col = 0; col < number; col++) {
                if (row > col) {
                    System.out.println(number - row - 1 + " ");
                } else {
                    System.out.println(number - col - 1 + " ");
                }
            }
            //reavahetus
            System.out.println();
        }
    }
}




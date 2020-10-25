import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = 1;

        while (number <= 100) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            number++;
        }
    }
}

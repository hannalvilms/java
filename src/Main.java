import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.println("*");
            i++;
        }
        System.out.println();
    }
}

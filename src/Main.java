import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        printSquare(4);
    }
    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize) {
            int j = 0;
            while (j < sideSize) {
                System.out.println("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}

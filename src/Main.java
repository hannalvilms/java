import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        printTriangle(4);
    }
    public static void printTriangle(int size) {
        int row = 0;
        while (row < size) {
            int width = 0;
            while (width <= row) {
                System.out.println("*");
                width++;
            }
            row++;
            System.out.println();
        }
    }
}

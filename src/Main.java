import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        printRectangle(2,5);
    }
    public static void printRectangle(int width, int height) {
        int h = 0;
        while (h < height) {
            int w = 0;
            while (w < width) {
                System.out.println("*");
                w++;
            }
            h++;
            System.out.println();
        }
    }
}

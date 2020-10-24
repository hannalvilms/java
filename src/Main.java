import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Let's calculate the circumference of a circle.");

        System.out.print("Type a radius: ");
        int radius = Integer.parseInt(reader.nextLine());

        System.out.println("Circumference of the circle is: " + ( 2 * Math.PI * radius));
    }
}

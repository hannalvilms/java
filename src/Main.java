import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Last number: ");
        int lastNumber = Integer.parseInt(reader.nextLine());

        while (firstNumber <= lastNumber) {
            System.out.println(firstNumber);
            firstNumber++;
        }
    }
}

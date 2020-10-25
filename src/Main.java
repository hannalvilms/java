import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int result = 0;
        System.out.print("First number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Last number: ");
        int lastNumber = Integer.parseInt(reader.nextLine());

        while (firstNumber <= lastNumber) {
            result += firstNumber;
            firstNumber++;
        }
        System.out.println("Sum is: " + result);
    }
}

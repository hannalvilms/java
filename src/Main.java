import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type a number: ");

        int secondNumber = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");

        System.out.println("Division: " + firstNumber + " / " + secondNumber + " = " + (firstNumber/secondNumber));
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int result = 0;
        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (result <= number) {
            result += number;
        }
        System.out.println("Factorial is: " + result);
    }
}

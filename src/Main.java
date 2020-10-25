import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 1;
        System.out.print("Type a number: ");
        int numberInput = Integer.parseInt(reader.nextLine());

        while (number <= numberInput) {
            System.out.println(number);
            number++;
        }
    }
}

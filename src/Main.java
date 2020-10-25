import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;

        while (number != -1) {
            sum += number;
            number = Integer.parseInt(reader.nextLine());
        }
        System.out.println("The sum is: " + sum);
        System.out.println("Thank you and see you later!");
    }
}

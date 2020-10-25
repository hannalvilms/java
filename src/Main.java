import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());

        while (number != -1) {
            number = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Thank you and see you later!");
    }
}

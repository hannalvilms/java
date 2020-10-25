import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        int sum = 0;
        int howMany = 0;
        double average = 0;

        while (number != -1) {
            sum += number;
            howMany++;
            average = (double)sum / howMany;
            number = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Average: " + average);
        System.out.println("How many numbers: " + howMany);
        System.out.println("The sum is: " + sum);
        System.out.println("Thank you and see you later!");
    }
}

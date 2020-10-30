import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        NumberStatistics allNumbers = new NumberStatistics();
        NumberStatistics evenNumbers = new NumberStatistics();
        NumberStatistics oddNumbers = new NumberStatistics();

        System.out.println("Type numbers: ");
        int number = Integer.parseInt(reader.nextLine());
        while (number != -1) {
            allNumbers.addNumber(number);
            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
            } else {
                oddNumbers.addNumber(number);
            }
            number = Integer.parseInt(reader.nextLine());
        }
        System.out.println("sum: " + allNumbers.sum());
        System.out.println("sum of even: " + evenNumbers.sum());
        System.out.println("sum of odd: " + oddNumbers.sum());
    }
}


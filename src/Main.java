import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int number = Integer.parseInt(reader.nextLine());
        int rightNumber = 50;

        if (number < rightNumber) {
            System.out.println("The number is greater.");
        } else if (number == rightNumber) {
            System.out.println("Congratulations, your guess is correct!");
        } else {
            System.out.println("The number is lesser.");
        }
    }

}


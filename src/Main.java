import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        drawNumber();
    }

    public static void drawNumber() {
        int number = (int)(Math.random()*101) ;
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number: ");

        int guess = Integer.parseInt(input.nextLine());

        while (number != guess) {
            if (guess < number) {
                System.out.println("The number is greater.");
            } else if (guess > number) {
                System.out.println("The number is lesser.");
            }
            System.out.println("Guess a number: ");
            guess = Integer.parseInt(input.nextLine());
        }
        System.out.println("Congratulations, your guess is correct!");
    }
}


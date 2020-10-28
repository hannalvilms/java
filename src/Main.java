import java.util.Scanner;

public class Main {
    Scanner reader = new Scanner(System.in);
    public static double average(double number1, double number2, double number3, double number4) {
        double numberAverage = (number1 + number2 + number3 + number4)/4;
        return numberAverage;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        double numberOne = Integer.parseInt(reader.nextLine());
        double numberTwo = Integer.parseInt(reader.nextLine());
        double numberThree = Integer.parseInt(reader.nextLine());
        double numberFour = Integer.parseInt(reader.nextLine());
        double answer = average(numberOne, numberTwo, numberThree, numberFour);
        System.out.println("Average: " + answer);
    }
}


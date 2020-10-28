import java.util.Scanner;

public class Main {
    public static int calculateCharacters(String text) {
        return text.length();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String yourName = reader.nextLine();

        System.out.println("Number of characters: " + calculateCharacters(yourName));
    }
}


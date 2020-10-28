import java.util.Scanner;

public class Main {
    public static char firstCharacter(String text) {
        char character = text.charAt(0);
        return character;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String yourName = reader.nextLine();

        System.out.println("First character: " + firstCharacter(yourName));
    }
}


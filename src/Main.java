import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the last part: ");
        int length = Integer.parseInt(reader.nextLine());

        String lastPart = word.substring(length);

        System.out.println("Result: " + lastPart);

    }
}


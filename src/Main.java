import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String yourName = reader.nextLine();

        int i = 0;
        if (yourName.length() >= 3) {
            while (i < 3) {
                System.out.println((i+1) + ". character: " + yourName.charAt(i));
                i++;
            }
        }
    }
}


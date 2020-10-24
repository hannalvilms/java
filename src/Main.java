import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

      //  System.out.print("Type a password: ");
      //  String password = reader.nextLine();

        while (true) {
            System.out.println("Type a password: ");
            String password = reader.nextLine();

            if (password.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("Secret message: qwerty");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}

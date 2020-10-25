import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int result = 0;
        System.out.print("Sum until: ");
        int number = Integer.parseInt(reader.nextLine());
        int i = 1;
        while (i <= number) {
            result += i;
            i++;
        }
        System.out.println("Sum is: " + result);
    }
}

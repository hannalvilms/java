import java.util.Random;

public class PasswordRandomizer {
    private int length;

    public PasswordRandomizer(int length) {
        this.length = length;
    }

    public String createPassword() {
        String password = "";
        Random randomizer = new Random();
        int i = 0;
        while (i < this.length) {
            int number = randomizer.nextInt(26);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
            password += (String.valueOf(symbol));
            i++;
        }
        return password;
    }
}

    
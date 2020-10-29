import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String typeWord = reader.nextLine();
            words.add(typeWord);

            if (typeWord.isEmpty()) {
                System.out.println("You typed the following words: ");
                break;
            }
        }

        for (String word : words) {
            System.out.println( word );
        }
    }
}


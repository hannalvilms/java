import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Type a word: ");
            String typeWord = reader.nextLine();
            words.add(typeWord);
            Collections.reverse(words);

            if (typeWord.isEmpty()) {
                break;
            }
        }

        Collections.reverse(words);
        System.out.println("You typed the following words: ");

        for (String word : words) {
            System.out.println( word );
        }
    }
}


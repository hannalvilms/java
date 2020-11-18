import java.util.*;

public class TextUserInterface {

    public Scanner reader;
    public Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    public void start(){
        System.out.println("Statements: ");
        System.out.println("  add - adds a word pair to the dictionary ");
        System.out.println("  translate - asks a word and prints its translation");
        System.out.println("  quits - quit the text user interface ");

        while (true) {
            System.out.print("Statement: ");
            String input = reader.nextLine();

            if (input.equals("quit")) {
                System.out.println("Cheers!");
                break;
            } else if (input.equals("add")) {
                System.out.print("In Finnish: ");
                String word = reader.nextLine();
                System.out.print("Translation: ");
                String translation = reader.nextLine();
                add(word,translation);
                System.out.println();
            } else if (input.equals("translate")) {
                System.out.print("Give a word: ");
                String word = reader.nextLine();
                System.out.print("Translation: " + translate(word));
                System.out.println();
            } else {
                System.out.println("Unknown statement");
                System.out.println();
            }
        }

    }

    public void add(String word, String translation) {
        dictionary.add(word, translation);
    }

    public String translate(String word) {
        return dictionary.translate(word);
    }
}

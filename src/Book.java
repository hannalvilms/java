public class Book implements ToBeStored {

    public String writer;
    public String title;
    public double weight;

    public Book(String writer, String title, double weight) {
        this.title = title;
        this.writer = writer;
        this.weight = weight;
    }

    public String toString() {
        return this.writer + ": " + this.title;
    }

    public double weight() {
        return this.weight;
    }
}

public class CD implements ToBeStored{
    public String artist;
    public String title;
    public int publishingYear;

    public CD(String artist, String title, int publishingYear) {
        this.title = title;
        this.artist = artist;
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
    }

    public double weight() {
        return 0.1;
    }
}

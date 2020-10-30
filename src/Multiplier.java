public class Multiplier {

    private int nr;

    public Multiplier(int number) {
        this.nr = number;
    }
    public int multiply(int otherNumber) {
        int answer = otherNumber * nr;
        return answer;
    }
}

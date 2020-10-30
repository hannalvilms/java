public class DecreasingCounter {
    private int value;   // object variable that remembers the value of the counter

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        this.value--;
        if (value <= 0) {
            value = 0;
        }
    }
}
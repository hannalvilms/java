import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public int age() {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows:
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        int currentPP = Calendar.getInstance().get(Calendar.DATE);
        int currentKK = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int currentVV = Calendar.getInstance().get(Calendar.YEAR);

        MyDate currentDay = new MyDate(currentPP,currentKK,currentVV);

        return this.birthday.differenceInYears(currentDay);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name +", born "+ this.birthday;
    }
}
  
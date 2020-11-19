public class MilitaryService implements NationalService {

    public int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    @Override
    public int getDaysLeft() {
        return daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft >= 1) {
            this.daysLeft-- ;
        }
    }
}

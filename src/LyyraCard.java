public class LyyraCard {

    private double balance;
    private double amount;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public String toString() {
        return "The card has " + this.balance + " euros.";
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4) {
            this.balance -= 4;
        }
    }

    public void loadMoney(double amount) {
        if (amount >= 0) {
            this.balance += amount;
        }
        if (this.balance > 150) {
            this.balance = 150;
        }
    }

    public double balance() {
        return this.balance;
    }

    public boolean pay(double amount){

        // the method checks if the balance of the card is at least the amount given as parameter
        // if not, the method returns false meaning that the card could not be used for the payment
        // if the balance is enough, the given amount is taken from the balance and true is returned

        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}

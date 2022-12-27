package Transport;


public class Sponsor<T> {
    private final String name;
    private  int amount;

    public Sponsor(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public int getAmount() {

        return amount;
    }
    public void sponsorRace() {
        amount = 0;
    }

    public String getName() {
        return name;
    }
    public String toString() {
    return "Спонсор \"" + name + "\", сумма поддержки: " + amount;
    }
}



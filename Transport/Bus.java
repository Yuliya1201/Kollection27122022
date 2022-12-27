package Transport;

import java.util.*;

public abstract class Bus extends Transport implements  Competing {
    private String driver;
    private final Set<Mexanik<Bus>> mexanics;
    private int sponsors;

    public Bus(String brend, String model, Integer enginePower, String driver, String mexaniks) {
        super(brend, model, enginePower);
        setDriver(driver);
        this.mexanics = new HashSet<>();
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public Set<Mexanik<Bus>> getMexaniks() {
        return mexanics;
    }


    public void stopMove() {
        System.out.println("автобус остановился");
    }

    public void startMove() {
        System.out.println("автобус поехал");
    }

    public void printType() {

    }


    public boolean service() {
        System.out.println("автобус " + getBrand() + "" + getModel() + "в диагностике не нуждается");
        return true;
    }

    public void repair() {
        System.out.println("автобус " + getBrand() + "" + getModel() + " починен");
    }

    public Set<?> mexanics() {
        return getMexaniks();
    }

    public void pitStop() {
        System.out.println("пит стоп для автобуса");
    }


    public void finish() {
        System.out.println("Bus finished");

    }


    public void bestLapTime() {
        System.out.println("лучшее время круга для автобуса");
    }

    public void maxSpeed() {
        System.out.println("максимальная скорость для автобуса");
    }

    public String mexaniksInfo() {
        Set<?> mexaniks = mexanics();
        StringBuilder result = new StringBuilder();
        if (!mexanics.isEmpty()) {
            result.append(", ");
        }
        return result.toString();
    }
    public String toString() {
        StringBuilder result = new StringBuilder();
        List <Sponsor> sponsorList = new ArrayList<>(sponsors);
        if (!sponsorList.isEmpty()) {
            result.append("Спонсоры: ");
        }
        for (int i = 0; i < sponsorList.size(); i++) {
            result.append(sponsorList.get(i));
            if (i != sponsorList.size() - 1) {
                result.append(", ");
            }

        }
        return result.append("\n").append(mexaniksInfo()).toString();
    }

}




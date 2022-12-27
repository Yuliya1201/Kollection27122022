package Transport;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public abstract class Car extends Transport implements Competing {
    private String driver;
    private  Set <Mexanik<Car>> mexaniks;
    private VidKuzova vidKuzova;

    public  Car(String brend, String model, Integer engineVolume, VidKuzova vidKuzova, String driver,
                String mexaniks) {
        super(brend, model, engineVolume);
        setVidKuzova(vidKuzova);
        setDriver(driver);
        this.mexaniks = new HashSet<>(Arrays.asList());

    }

    public VidKuzova getVidKuzova() {

        return vidKuzova;
    }
    public void repair() {
        System.out.println("машина " + getBrand() + "" + getModel() + " починена");
    }
    public Set <?> mexaniks () {
        return (Set<?>) mexaniks;
    }

    public String getDriver() {
        return driver;
    }
    public Set <Mexanik<Car>> getMexaniks () {
        return mexaniks;
    }


    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setMexaniks(Set<Mexanik<Car>> mexaniks) {
        this.mexaniks = mexaniks;
    }

    public void setVidKuzova(VidKuzova vidKuzova) {

        this.vidKuzova = vidKuzova;
    }

    public void startMove() {

        System.out.println("Легковая машина поехала");
    }

    public void stopMove() {

        System.out.println("Легковая машина остановилась");

    }

    public void theBestTime() {

        System.out.println("Лучшее время круга для легкового автомобиля");
    }

    public void printType() {
        if (vidKuzova == null) {
            System.out.println("Данных для авто недостаточно");
        } else {
            System.out.println(vidKuzova);
        }

    }

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime() {

    }

}

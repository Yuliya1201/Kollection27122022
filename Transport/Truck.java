package Transport;



import java.util.HashSet;
import java.util.Set;

public abstract class Truck extends Transport implements Competing {
    private int weights;
    private String driver;
    private Set <Mexanik<Truck>> mexaniks;
    public  Truck (String brend, String model, Integer engineVolume, int weights, String driver,
                   String mexaniks) {
        super(brend, model, engineVolume);
        setDriver(driver);
        this.mexaniks = new HashSet<>();
        this.weights = weights;
    }
 public void printType() {
        if (weights == 0) {
            System.out.println("Данных для авто недостаточно");
        } else {
            System.out.println(weights);
        }
    }

    public boolean service() {
        return Math.random() > 0.75;
    }
    public  void addSponsor() {

    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }
    public Set <Mexanik<Truck>> getMexaniks(){
        return mexaniks;
    }


    @Override
    public Set<?> mexaniks() {
        return null;
    }


    @Override
    public void getBestLapTime() {

    }

    @Override
    public void getPitStop() {

    }

    @Override
    public void repair() {
        System.out.println("грузовик "+ getBrand() +""+ getModel() + " починен");
    }

    public void startMove() {
        System.out.println("Грузовик поехал");
    }
    public void stopMove() {
        System.out.println("Грузовик остановился");
    }
    public void pitStop() {
        System.out.println("Пит стоп для грузовика");
    }
    public void theBestTime() {
        System.out.println("Лучшее время круга грузовика");
    }
    public void maxSpeed() {
        System.out.println("Максимальная скорость грузовика");
    }

}

package Transport;


public abstract class DriverB <T extends Car> extends Driver<Car> {

    public DriverB(String name, Boolean hasLicense, Integer experience) {
        super(name, hasLicense, experience);
    }

    public String start() {
        return "автомобиль стартует";
    }

    public String stop() {
        return "машина останавливается";
    }


    public  String refuel() {
        return "заправка автомобиля";
    }

    public String getCarMessage(T passengerCars) {
        return "водитель " + getName() + " автомобиля" + passengerCars.getModel() + "" +
                passengerCars.getBrand() + "будет участвовать в заезде";
    }
}

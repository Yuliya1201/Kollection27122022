package Transport;


public abstract class DriverD<T extends Truck> extends Driver<Truck> {
    private String category;

    public DriverD(String name, Boolean hasLicense, Integer experience) {
        super(name, hasLicense, experience);
        setCategory(category);
    }

    public void setCategory(String category) {
        if (category==null) {
            throw new IllegalArgumentException("выбрать категорию прав");
        }
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public String start() {
        return "грузовик стартует";
    }

    public String stop() {
        return "грузовик останавливается";
    }

    public String refuel() {
        return "заправка грузовика";
    }

}
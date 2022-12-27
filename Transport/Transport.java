package Transport;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public abstract class Transport {
    private final String brand;
    private final String model;
    private  Integer enginePower;

    public Transport (String brand,String model,Integer enginePower) {
        this.model = model;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        if (enginePower <= 0) {
            this.enginePower = 2;
        } else {
            this.enginePower = enginePower;
        }
    }
    public abstract void startMove();
    public abstract void stopMove();
    public abstract void repair();
    public abstract Set <?> mexaniks();
    public String mexanicInfo() {
        List <?> mexaniks = new ArrayList<>(mexaniks());
        StringBuilder result = new StringBuilder();
        if (!mexaniks.isEmpty()) {
            result.append("механики: ");
        }
        for (int i = 0; i < mexaniks.size(); i++) {
            result.append(mexaniks.get(i));
            if (i != mexaniks.size() - 1) {
                result.append(", ");
            }

        }
        return result.toString();
    }

    public boolean service() {
        return false;
    }
}
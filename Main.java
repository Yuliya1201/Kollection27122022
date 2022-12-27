import com.javacource.Product.Product;
import com.javacource.Product.ProductList;
import com.javacource.Product.Recept;
import com.javacource.Product.ProductList;
import Transport.*;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import Transport.DriverB;
import Transport.DriverD;
import Transport.DriverC;
import Transport.Car;
import Transport.Truck;
import Transport.Bus;
import Transport.Driver;
import Transport.Sponsor;
import Transport.Mexanik;


public class Main {

    public static void main(String[] args) {
        Mexanik<Car> petya = new Mexanik<Car>("Petr", "Petrov", "Lip");
        Mexanik<Truck> vanya = new Mexanik<Truck>("Vanya", "Ivanov", "Sok");
        Mexanik<Transport> nikita = new Mexanik<Transport>("Nikita", "Nikiforov", "Deo");

        Sponsor<Car> lip = new Sponsor<Car>("Lip", 10_000);
        Sponsor<Truck> sok = new Sponsor<Truck>("Sok", 250_000);
        Sponsor<Bus> deo = new Sponsor<Bus>("Deo", 450_000);

        DriverB<Car> driverCar = new DriverB<Car>("Воронов Виктор Валерьевич", true, 10) {
        };
        DriverC<Bus> driverC = new DriverC<Bus>("Иванов Иван Иванович",true,15) {
        };
        DriverD<Truck>truckDriverD = new DriverD<Truck>("Аванесов Аванес Витальевич",true,34) {
        };

        Car car = new Car("toyota","land cruzer",190,VidKuzova.COUPE,
                "camvel","Xachik") {
        };

        Truck kamaz = new Truck("kamaz","E-112",130,2,"Vanya",
                "Nikita") {
        };
        Bus bus = new Bus("Ikarus","I-345",150,"Ivanov","Petrov") {
            @Override
            public void getPitStop() {

            }

            @Override
            public void getBestLapTime() {

            }

            @Override
            public Set<?> mexaniks() {
                return null;
            }
        };




        Product banan = new Product("банан", 30, 50);
        System.out.println(banan);
        Product apelsin = new Product("apelsin", 70, 500);
        System.out.println(apelsin);
        Product vinograd = new Product("vinograd", 60, 800);
        System.out.println(vinograd);


        Recept sharlotka = new Recept("apple",600,"4 apple");
        Recept salat = new Recept("gorox,mayonez,chiken",400,"oliver");
    }
}
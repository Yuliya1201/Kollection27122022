package Transport;

import Transport.Truck;

    public abstract class DriverC<T extends Bus> extends Driver<Bus> {

        public DriverC(String name, Boolean hasLicense, Integer experience) {

            super(name, hasLicense, experience);
        }

        public String start() {
            return "автобус стартует";
        }

        public String stop() {
            return "автобус останавливается";
        }

        public String refuel() {
            return "заправка автобуса";
        }

        public String getCarMessage(T bus) {
            return "водитель " + getName() + "  автобуса" + bus.getModel() + "" +
                    bus.getBrand() + "будет участвовать в заезде";
        }
    }


package Transport;


    public abstract class Driver<T> {
        private final String name;
        private final Boolean hasLicense;
        private final Integer experience;


        public Driver(String name, Boolean hasLicense, Integer experience) {
            this.name = name;
            this.hasLicense = hasLicense;
            this.experience = experience;

        }


        public String getName() {
            return name;
        }

        public Boolean getHasLicense() {
            return hasLicense;
        }

        public Integer getExperience() {
            return experience;
        }

        public abstract String start();

        protected abstract String stop();

        public abstract String refuel();
        }


package Transport;

public class Mexanik<T extends Transport> {

        private final String nameMex;
        private final String sernameMex;
        private final String company;

        public Mexanik(String nameMex, String sernameMex, String company) {
            this.nameMex = nameMex;
            this.sernameMex = sernameMex;
            this.company = company;
        }

        public void doService(T transport) {
        transport.service();
        }
        public void doRepair(T transport) {
            transport.repair();
        }


        public String getNameMex() {
            return nameMex;
        }

        public String getSernameMex() {
            return sernameMex;
        }

        public String getCompany() {
            return company;
        }

        @Override
        public String toString() {
            return "Механик " + nameMex + " " + sernameMex + " из\"" + company + "\"";
        }
    }


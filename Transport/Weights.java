package Transport;


public enum Weights {
    N1(0.0, 3.5),
    N2(3.5, 12.0),
    N3(12.0, 0.0);


    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }

    Weights(double from, double to) {

        this.from = from;
        this.to = to;
    }


        private final double from;
        private final double to;


    }






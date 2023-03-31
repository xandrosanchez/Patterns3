public class Passenger extends Person implements Baggage {
    private int baggageWeight;

    public Passenger(String name, int weight, int baggageWeight) {
        super(name, weight);
        this.baggageWeight = baggageWeight;
    }

    @Override
    public boolean hasBaggage() {
        return true;
    }

    @Override
    public int getBaggageWeight() {
        return baggageWeight;
    }
}

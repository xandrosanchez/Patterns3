import java.util.ArrayList;
import java.util.List;

public class PassengerComponent extends FlightComponent {
    private List<Baggage> baggageList;

    public PassengerComponent(String name) {
        super(name, 0);
        this.baggageList = new ArrayList<>();
    }

    @Override
    public boolean hasBaggage() {
        return true;
    }

    @Override
    public List<Baggage> getBaggageList() {
        return baggageList;
    }

    @Override
    public void add(FlightComponent component) {
    }

    @Override
    public void remove(FlightComponent component) {
    }

    @Override
    public FlightComponent getChild(int i) {
        return null;
    }

    public void addBaggage(Baggage baggage) {
        baggageList.add(baggage);
    }
}

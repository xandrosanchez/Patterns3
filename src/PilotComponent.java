import java.util.ArrayList;
import java.util.List;

public class PilotComponent extends FlightComponent {
    public PilotComponent(String name) {
        super(name, 0);
    }

    @Override
    public boolean hasBaggage() {
        return false;
    }

    @Override
    public List<Baggage> getBaggageList() {
        return new ArrayList<>();
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
}

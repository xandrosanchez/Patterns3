import java.util.ArrayList;
import java.util.List;

public class EconomyClassComponent extends FlightComponent {
    private List<FlightComponent> passengerComponents;

    public EconomyClassComponent(String name) {
        super(name, 0);
        this.passengerComponents = new ArrayList<>();
    }

    @Override
    public boolean hasBaggage() {
        return true;
    }

    @Override
    public List<Baggage> getBaggageList() {
        List<Baggage> baggageList = new ArrayList<>();
        for (FlightComponent passengerComponent : passengerComponents) {
            baggageList.addAll(passengerComponent.getBaggageList());
        }
        return baggageList;
    }

    @Override
    public void add(FlightComponent component) {
        passengerComponents.add(component);
    }

    @Override
    public void remove(FlightComponent component) {
        passengerComponents.remove(component);
    }

    @Override
    public FlightComponent getChild(int i) {
        return passengerComponents.get(i);
    }

    public List<FlightComponent> getPassengerComponents() {
        return passengerComponents;
    }
}

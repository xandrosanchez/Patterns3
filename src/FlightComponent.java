import java.util.List;

public abstract class FlightComponent {
    protected String name;
    protected int weight;

    public FlightComponent(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public abstract boolean hasBaggage();

    public abstract List<Baggage> getBaggageList();

    public abstract void add(FlightComponent component);

    public abstract void remove(FlightComponent component);

    public abstract FlightComponent getChild(int i);
}

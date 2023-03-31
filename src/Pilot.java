public class Pilot extends Person {
    public Pilot(String name) {
        super(name, 0);
    }

    @Override
    public boolean hasBaggage() {
        return false;
    }
}

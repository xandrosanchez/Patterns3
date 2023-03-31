public class Stewardess extends Person {
    public Stewardess(String name) {
        super(name, 0);
    }

    @Override
    public boolean hasBaggage() {
        return false;
    }
}

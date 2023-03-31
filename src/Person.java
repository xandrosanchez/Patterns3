public abstract class Person {
    protected String name;
    protected int weight;

    public Person(String name, int weight) {
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
}

package collection;

public class Planets {
    private String name;
    private double mass;

    public Planets(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planets name= " + name + ", mass = " + mass;
    }
}

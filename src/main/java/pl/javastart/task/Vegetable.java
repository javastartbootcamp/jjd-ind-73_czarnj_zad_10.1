package pl.javastart.task;

import java.util.Objects;

public class Vegetable {
    private String name;
    private double weight;

    public Vegetable(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vegetable vegetable)) return false;
        return Double.compare(vegetable.weight, weight) == 0 && Objects.equals(name, vegetable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight);
    }
}

package lesson11;

import lesson11.fru.Fruit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Box<T extends Fruit> {
    private List<T> container;

    public Box() {
        this.container = new ArrayList<>();

    }

    public Box(T... fru) {
        this.container = new ArrayList<>(Arrays.asList(fru));
    }

    public float getWeight() {
        float w = 0.0f;
        for (T fruit : container) {
            w += fruit.getWeight();
        }
        return w;
    }

    public void add(T fruit) {
        container.add(fruit);
    }

    public boolean compare(Box<?> another) {
        return Math.abs(this.getWeight() - another.getWeight()) < 0.0001;
    }

    public boolean trans(Box<? super T> another) {
        if (another == this) {
            return true;
        }
        another.container.addAll(this.container);
        this.container.clear();


        return true;
    }

    @Override
    public String toString() {
        return "Box{" +
                "container=" + container +
                '}';
    }
}

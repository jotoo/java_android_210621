package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decrease(int amount) {
        if (food <= 0) {
            return false;
        } else { if (food >= amount)
        {food -= amount;}
        }
        return true;


    }
    public boolean polojitb_edu(int add) {
        if (food <=0) {
           return false;
        } else {food += add;}
        return true;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}

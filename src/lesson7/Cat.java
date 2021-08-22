package lesson7;

public class Cat {
    private String name;
    private boolean sitostb = false;

    public Cat(String name, boolean sitostb) {
        this.name = name;
        this.sitostb = sitostb;
    }

    public String getName() {
        return name;
    }

    public boolean isSitostb() {
        return sitostb;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", sitostb=" + sitostb +
                '}';
    }

    public boolean podhod(Plate plate) {
        if (plate.getFood() >= 15) {plate.decrease(15);
            System.out.println("cat " + name + " sit!");
            return true;
        } else {
            System.out.println("cat " + name + " goloden!");
        }
        return false;


    }

}

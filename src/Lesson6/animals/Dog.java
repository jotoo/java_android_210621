package Lesson6.animals;

public class Dog extends Animal {
    public Dog(String name, int beg, int plav) {
        super(name, beg, plav);
    }

    @Override
    public void go(int n) {
        if ((n <= beg) && (n >= 0)) {
            System.out.println(name + " probrjal " + n + " m");

        } else {
            System.out.println(name + " ne probejit ~!");
        }
    }

    @Override
    public void plivi(int n) {
        if ((n <= plav) && (n > 0)) {
            System.out.println(name + " proplil " + n + "m! ");
        } else {
            System.out.println(name + " ne poplivet ~!");
        }
    }
}

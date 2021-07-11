package Lesson6.animals;

public class Animal {
    String name;
    int beg;
    int plav;

    public Animal(String name, int beg, int plav) {
        this.name = name;
        this.beg = beg;
        this.plav = plav;
    }


    public void info() {
        System.out.printf("%s %d %d\n", name, beg, plav);
    }

    public void go(int n) {
    }


    public void plivi(int n) {
    }

}

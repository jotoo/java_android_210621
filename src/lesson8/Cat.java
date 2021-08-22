package lesson8;

public class Cat implements Fiz {
    private String name;
    private int maxrun;
    private int maxjump;

    {
        maxrun = 100;
        maxjump = 1;
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxrun() {
        return maxrun;
    }

    public int getMaxjump() {
        return maxjump;
    }

    public boolean jump(int visota) {
        if (maxjump >= visota) {
            System.out.println(name + " прыгнул!");
            return true;
        }
        System.out.println(name + " не смог!");
        return false;
    }

    public boolean run(int dlinna) {
        if (maxrun >= dlinna) {
            System.out.println(name + " пробежал!");
            return true;
        }
        System.out.println(name + " не смог!");
        return false;
    }
}

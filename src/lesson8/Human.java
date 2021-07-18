package lesson8;

public class Human implements Fiz {
    private String name;
    private int maxrun;
    private int maxjump;

    {
        maxrun = 500;
        maxjump = 2;
    }

    public Human(String name) {
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

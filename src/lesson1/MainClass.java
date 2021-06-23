package lesson1;

public class MainClass {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        byte a = 1;
//        int b = 2;
//        short c = 12;
//        long d = 24L;
//        float f = 0.122f;
//        double g = 0.222;
//        char h = '\u1234';
//        System.out.println(h);
//        boolean i;
//        i = 5 != 6;
//        System.out.println(i);


        float f = z3(0.22f, 0.23f, 0.24f, 0.25f);
        System.out.println(f);
        boolean h = z4(12, 12);
        System.out.println(h);
        z5(0);
        boolean y = z6(-1);
        System.out.println(y);
        z7("Vova");
        boolean z = z8(1000);
        if (z = true) {
            System.out.println("nevis");
        }


    }

    public static float z3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean z4(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }


    public static void z5(int a) {
        if (a >= 0) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
    }

    public static boolean z6(int a) {
        return (a < 0);
    }

    public static void z7(String word) {
        System.out.println("=========");
        System.out.println("hello " + word + "!");
        System.out.println("=========");
    }

    public static boolean z8(int a) {
        return (a % 100 == 0);
//        return (a % 4 == 0);
//        return (a % 400 == 0);


    }

}




package lesson8;

public class Main {
    public static void main(String[] args) {

//        Cat cat = new Cat("Barsik");
//        Robot robot = new Robot("Arni");
//        Human human = new Human("Vasya");
//        Wall wall = new Wall(4);
//        Road road = new Road(400);
//
//        wall.tryjump(cat);
//        road.tryrun(cat);

        Fiz[] fiz = {
                new Cat("Murzik"),
                new Cat("Lusia"),
                new Robot("Valli"),
                new Robot("R"),
                new Human("Lena"),
                new Human("Vova"),
        };
        Pro[] pro = {
                new Wall(1),
                new Wall(5),
                new Wall(9),
                new Road(98),
                new Road(511),
                new Road(421),
        };
        for (int i = 0; i < pro.length; i++) {
            pro[i].tryrun(fiz[i]);
            pro[i].tryjump(fiz[i]);


        }

    }
}

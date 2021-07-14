package lesson7;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate(60);
        plate.polojitb_edu(14);
        Cat[] cats = {
                new Cat("Murzik", false),
                new Cat("Lusya", false),
                new Cat("Mila", false),
                new Cat("Barsik", false),
                new Cat("Vasya", false)

        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].podhod(plate);


        }
        System.out.println(plate);
    }
}

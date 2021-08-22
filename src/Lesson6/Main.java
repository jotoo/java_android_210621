package Lesson6;

import Lesson6.animals.*;


public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Semen", 200, 0);
        Cat cat1 = new Cat("Lusia", 200, 0);
        Dog dog = new Dog("Tuman", 500, 10);
        Dog dog1 = new Dog("Sobaka", 500, 10);
        cat.go(100);
        cat.plivi(0);
        cat1.go(210);
        cat1.plivi(1);
        dog.go(450);
        dog.plivi(9);
        dog1.go(550);
        dog1.plivi(-10);
        cat.info();
    }


}

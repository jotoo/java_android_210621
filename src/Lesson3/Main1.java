package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        guessnumber();
//        game();

    }

    public static void guessnumber() {

        int x = random.nextInt(10);
        int count = 3;
        int usernumber;
        do {
            System.out.println("Введите число от 0 до 9:" + "   У вас " + count-- + " попытки");
            usernumber = sc.nextInt(10);
            if (usernumber > x) {
                System.out.println("Попробуй меньше! ");
            } else {
                System.out.println("Попробуй больше! ");
            }


        } while ((usernumber != (x)) && count != 0);

        if (count == 0) {
            System.out.println("проиграно! ");
            game();
            return;
        }
        System.out.println("число угадано!");
        game();
    }

    public static void game() {
        int usernumber;
        System.out.println("Сыграть ещё? 1 = да. 0 = нет. ");
        usernumber = sc.nextInt(2);
//        if (usernumber == 1) {
//            guessnumber();
//        } else {return;}
        switch (usernumber) {
            case 1:
                guessnumber();
            case 0:
                System.out.println("Бай! ");
                break;

        }
    }
//    public  static void comparison() {
//        if (usernumber > x) {
//            System.out.println("Попробуй меньше! ");
//        } else {
//            System.out.println("Попробуй больше! ");
//        } return;
//    }


}






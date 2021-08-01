package lesson11;


import lesson11.fru.Apple;
import lesson11.fru.Fruit;
import lesson11.fru.Orange;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] arr = {"as", "us", "is", "ts"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);
        swap(arr, 1, 2);
        System.out.println(Arrays.asList(arr));


        Box<Orange> box1 = new Box<>();
        box1.add(new Orange());
        box1.add(new Orange());
        box1.add(new Orange());
        Box<Apple> box2 = new Box<>();
        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());
        Box<Apple> box3 = new Box<>();
        box3.add(new Apple());
        box3.add(new Apple());
        Box<Fruit> box4 = new Box<>();
        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);
        System.out.println(box1.compare(box3));
        System.out.println(box2.compare(box3));
        System.out.println(box1.trans(box4));
        System.out.println(box4);
        System.out.println(box1);


    }

    public static void swap(Object[] arr, int x, int y) {
        Object obj = arr[x];
        arr[x] = arr[y];
        arr[y] = obj;
    }


}

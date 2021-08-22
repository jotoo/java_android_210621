package lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] arr = {
                "Кактус", "Кактус", "Кактус", "Кактус", "Дерево", "Дверь", "Дверь", "Звезда", "Звезда", "Небо", "Небо"
        };
        System.out.println(Arrays.toString(arr));
        HashMap<String, Integer> spisok = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            spisok.put(arr[i], spisok.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println(spisok);
        System.out.println(spisok.keySet());


        Telbook telbook = new Telbook();
        telbook.add("Vasya", "89998882211");
        telbook.add("Vova", "89997771122");
        telbook.add("Lena", "89996661222");
        telbook.add("Lena", "03");
        telbook.add("Dasha", "89997771112");
        System.out.println(telbook);
        System.out.println("Nomer " +  "= " + telbook.get("Dasha"));


    }


}


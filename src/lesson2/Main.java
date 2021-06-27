package lesson2;

import java.util.Random;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {

        int[] arrz1 = new int[10];
//        int[] arrz1 = {1,1,1,1,1,1,1,1,1,1};
        for (int i = 0; i < arrz1.length; i++) {
            arrz1[i] = random.nextInt(2);
            if (arrz1[i] == 0) {
                arrz1[i] += 1;
            } else {
                arrz1[i] -= 1;
            }
            System.out.print(arrz1[i] + "   ");
        }
        System.out.println();

        int[] arrz2 = new int[8];
        for (int i = 0; i < arrz2.length; i++) {
            do {
                System.out.print(arrz2[i] + "  ");
                arrz2[i] += 3;
            } while (arrz2[i] <= 21);
            {
                break;
            }

        }
        System.out.println();
        int[] arrz3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrz3.length; i++) {
            if (arrz3[i] <= 6) {
                arrz3[i] *= 2;
            }
            System.out.print(arrz3[i] + " ");

        }
        System.out.println();


        int[][] arr = new int[7][7];
        arrz4m(arr);

        int[] arr2 = new int[]{2, 2, 3, 4, 5, 8};
        arrz5m(arr2);
    }


    public static void arrz4m(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.printf("%-4d", arr[i][j]);


            }
            System.out.println();

        }


    }

    public static void arrz5m(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min){
                min = arr[i];
            }


        }
        System.out.println(max + " " + min);

    }
}



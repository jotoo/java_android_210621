package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class XOgame {
    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';
    static char[][] map;
    static final int SIZE = 3;
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        map();
        printmap();

        while (true) {
            HumanTurn();
            printmap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы победили! ");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья! ");
                break;
            }
            AiTurn();
            printmap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил компьютер! ");
                break;
            }
            if (isFull()) {
                System.out.println("Ничья! ");
                break;
            }


        }

    }

    public static void map() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }


    }

    public static void printmap() {
        System.out.printf("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.printf("%d ", i + 1);
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%c ", map[i][j]);

            }
            System.out.println();
        }


    }

    public static void HumanTurn() {
        int y;
        int x;
        do {
            System.out.println("Input y x");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (y < 0 || x < 0 || y >= SIZE || x >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void AiTurn() {
        int y;
        int x;
        do {
            y = random.nextInt(SIZE);
            x = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }

            }

        }
        return true;
    }

    public static boolean checkWin(char c) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if ((map[i][0] == c && map[i][1] == c &&
                        map[i][2] == c) ||
                        (map[0][i] == c && map[1][i] == c &&
                                map[2][i] == c))
                    return true;
                if ((map[0][0] == c && map[1][1] == c &&
                        map[2][2] == c) ||
                        (map[2][0] == c && map[1][1] == c &&
                                map[0][2] == c))
                    return true;

            }
        }

        return false;
    }
}




package lesson9;

public class Main {
    static int SIZE = 4;

    public static void main(String[] args) {

        String[][] arr = {

                {"1b", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15","16"}

        };

        try {System.out.println(sum(arr));}
        catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(arr[e.getRow()][e.getCol()]);
        }
        System.out.println("End !");

    }

    static int sum(String[][] a) throws MyArraySizeException, MyArrayDataException {
        if (a.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                try {
                    sum += Integer.parseInt(a[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный формат " + i + " " + j, i, j);
                }

            }

        }
        return sum;

    }

}








package aston.method;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(task14(5, 2)));
    }

    /*
     *  Написать метод, принимающий на вход два аргумента:
     *  len и initialValue, и возвращающий одномерный массив типа int длиной len,
     *  каждая ячейка которого равна initialValue.
     */

    private static int[] task14(int size, int value) {
        int[] matrix = new int[size];
        for (int i = 0; i < size; i++) {
            matrix[i] = value;
        }
        return matrix;
    }
}

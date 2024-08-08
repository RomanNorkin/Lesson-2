package aston.method;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        task13(10, 1);
    }

    /*
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
     * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
     * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], ..., [n][n];
     */

    private static void task13(int size, int value) {

        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {

            matrix[i][i] = value;

            matrix[i][i] = value;

            System.out.println(Arrays.toString(matrix[i]));
        }

    }
}

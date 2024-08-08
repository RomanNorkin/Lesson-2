package aston.method;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        fillArrey();
    }

    /*
     * Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
     */

    private static void fillArrey() {
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

}
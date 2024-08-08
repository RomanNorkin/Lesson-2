package aston.method;

public class Main {

    public static void main(String[] args) {
        checkNumber(10);
    }

    /*
     * Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
     *  положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */

    private static void checkNumber(int number) {

        if (number >= 0) {
            System.out.println(number + " - число положительное");
        } else {
            System.out.println(number + " - число отрицательное");
        }
    }
}
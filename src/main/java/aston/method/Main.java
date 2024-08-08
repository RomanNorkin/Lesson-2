package aston.method;

public class Main {

    public static void main(String[] args) {
        checkNumber2(45);
    }

    /*
     * Напишите метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * Замечание: ноль считаем положительным числом.
     */

    private static void checkNumber2(int number) {

        if (number >= 0) {
            System.out.println("false");
        } else System.out.println("true");
    }
}
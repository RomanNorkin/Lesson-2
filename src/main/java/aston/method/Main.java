package aston.method;

public class Main {

    public static void main(String[] args) {

        yearCheck(400);
    }

    /*
     * Напишите метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     */

    private static void yearCheck(int year) {

        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
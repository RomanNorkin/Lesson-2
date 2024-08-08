package aston.method;

public class Main {

    public static void main(String[] args) {
        check();
    }

    /*
     * Напишите метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */

    private static void check() {
        int a = 6;
        int b = 32;
        int c = a + b;

        if ((c >= 10) && (c <= 20)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
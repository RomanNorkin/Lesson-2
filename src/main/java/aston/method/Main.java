package aston.method;

public class Main {

    public static void main(String[] args) {
        compareNumbers();
    }

    /*
     * Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
     * то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
     */

    private static void compareNumbers() {
        int a = 5;
        int b = 11;

        if (a >= b) {
            System.out.println(a + " >= " + b);
        } else {
            System.out.println(a + " < " + b);
        }
    }
}
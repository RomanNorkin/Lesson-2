package aston.method;

public class Main {

    public static void main(String[] args) {
        checkSumSign();
    }

    /*
     * Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
     * и инициализируйте их любыми значениями, которыми захотите.
     * Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0,
     * то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
     */

    private static void checkSumSign() {
        int a = -11;
        int b = 5;

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
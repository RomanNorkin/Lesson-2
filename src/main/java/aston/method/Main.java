package aston.method;

public class Main {

    public static void main(String[] args) {
        task8(15, "JAVA");
    }

    /*
     * Напишите метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    private static void task8(int number, String word) {
        for (int i = 1; i <= number; i++) {
            System.out.println(word);
        }
    }
}
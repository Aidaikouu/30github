public class Basics {
    public static void main(String[] args) {
        // Примитивные типы данных
        int number = 10;        // Целое число
        double pi = 3.14;       // Число с плавающей точкой
        char letter = 'A';      // Символ
        boolean isJavaFun = true; // Логический тип

        // Ссылочный тип данных (строка)
        String greeting = "Hello, Java!";

        // Вывод значений переменных в консоль
        System.out.println("Целое число: " + number);
        System.out.println("Число с плавающей точкой: " + pi);
        System.out.println("Символ: " + letter);
        System.out.println("Логический тип: " + isJavaFun);
        System.out.println("Строка: " + greeting);

        // Арифметические операции
        int sum = number + 5;
        double square = pi * pi;
        boolean comparison = number > 5;

        System.out.println("Сумма: " + sum);
        System.out.println("Квадрат числа π: " + square);
        System.out.println("Число больше 5? " + comparison);
    }
}

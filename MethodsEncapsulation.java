public class MethodsEncapsulation {

    // Пример инкапсуляции: использование private переменной и getter/setter методов
    private int number;

    // Конструктор для инициализации значения
    public MethodsEncapsulation(int number) {
        this.number = number;
    }

    // Геттер (getter) для получения значения переменной
    public int getNumber() {
        return number;
    }

    // Сеттер (setter) для изменения значения переменной
    public void setNumber(int number) {
        if (number > 0) {
            this.number = number; // Применение принципа инкапсуляции для безопасного изменения значения
        } else {
            System.out.println("Число должно быть положительным.");
        }
    }

    // Метод для вычисления квадрата числа
    public int square() {
        return number * number;
    }

    // Метод для вычисления куба числа
    public int cube() {
        return number * number * number;
    }

    // Метод для вывода информации о числе
    public void printInfo() {
        System.out.println("Число: " + number);
        System.out.println("Квадрат числа: " + square());
        System.out.println("Куб числа: " + cube());
    }

    public static void main(String[] args) {
        // Создание объекта и использование методов
        MethodsEncapsulation obj = new MethodsEncapsulation(5);

        // Вывод информации о числе
        obj.printInfo();

        // Изменение числа через сеттер
        obj.setNumber(10);

        // Вывод информации о новом числе
        obj.printInfo();

        // Попытка установить отрицательное число
        obj.setNumber(-5);
    }
}

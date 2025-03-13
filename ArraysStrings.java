public class ArraysStrings {
    public static void main(String[] args) {
        // Создание и инициализация массива целых чисел
        int[] numbers = {1, 2, 3, 4, 5};

        // Обращение к элементам массива и вывод их на экран
        System.out.println("Элементы массива:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент на позиции " + i + ": " + numbers[i]);
        }

        // Пример изменения элемента массива
        numbers[2] = 10; // Изменение значения на позиции 2 (третий элемент)

        System.out.println("\nМассив после изменения элемента:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент на позиции " + i + ": " + numbers[i]);
        }
    }
}

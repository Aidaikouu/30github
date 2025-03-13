import java.util.Arrays;

public class SortingAlgorithms {

    public static void main(String[] args) {
        int[] array1 = {64, 25, 12, 22, 11};
        int[] array2 = {64, 25, 12, 22, 11};

        System.out.println("Исходный массив: " + Arrays.toString(array1));
        bubbleSort(array1);
        System.out.println("Массив после пузырьковой сортировки: " + Arrays.toString(array1));

        selectionSort(array2);
        System.out.println("Массив после сортировки выбором: " + Arrays.toString(array2));
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}

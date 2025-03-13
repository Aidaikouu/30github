import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();
        
        if (age < 0) {
            System.out.println("Возраст не может быть отрицательным!");
        } else if (age < 18) {
            System.out.println("Вы несовершеннолетний.");
        } else if (age <= 65) {
            System.out.println("Вы взрослый человек.");
        } else {
            System.out.println("Вы пенсионер.");
        }
        
        scanner.close();
    }
}

// Интерфейс "Животное" с методом "sound"
interface Animal {
    void sound(); // Метод без реализации, который должен быть реализован в классах
}


abstract class Mammal implements Animal {
    // Абстрактный метод для перемещения
    public abstract void move();

    public void sound() {
        System.out.println("Млекопитающее издает звук");
    }
}

// Класс "Собака", который наследует от абстрактного класса Mammal
class Dog extends Mammal {
    @Override
    public void move() {
        System.out.println("Собака бегает");
    }

    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

// Класс "Кошка", который наследует от абстрактного класса Mammal
class Cat extends Mammal {
    @Override
    public void move() {
        System.out.println("Кошка прыгает");
    }

    @Override
    public void sound() {
        System.out.println("Кошка мяукает");
    }
}

// Основной класс с методом main
public class InterfacesAbstractClasses {
    public static void main(String[] args) {
        // Создание объектов классов Dog и Cat
        Animal myDog = new Dog(); // Интерфейс Animal ссылается на объект класса Dog
        Animal myCat = new Cat(); // Интерфейс Animal ссылается на объект класса Cat

        // Вызов метода sound (реализован в классе Dog и Cat)
        myDog.sound(); // Вывод: Собака лает
        myCat.sound(); // Вывод: Кошка мяукает

        Mammal mammalDog = (Mammal) myDog; // Преобразуем в тип Mammal для вызова move()
        mammalDog.move(); // Вывод: Собака бегает

        Mammal mammalCat = (Mammal) myCat; // Преобразуем в тип Mammal для вызова move()
        mammalCat.move(); // Вывод: Кошка прыгает
    }
}

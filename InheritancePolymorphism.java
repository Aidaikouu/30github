// Базовый класс "Животное"
class Animal {
    // Метод для звука животного
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

// Класс "Собака", наследующий от класса Animal
class Dog extends Animal {
    // Переопределение метода sound() для класса Dog
    @Override
    public void sound() {
        System.out.println("Собака лает");
    }
}

// Класс "Кошка", наследующий от класса Animal
class Cat extends Animal {
    // Переопределение метода sound() для класса Cat
    @Override
    public void sound() {
        System.out.println("Кошка мяукает");
    }
}

// Основной класс с методом main
public class InheritancePolymorphism {
    public static void main(String[] args) {
        // Создаем объекты классов Dog и Cat
        Animal myDog = new Dog(); // Полиморфизм: переменная типа Animal, но объект типа Dog
        Animal myCat = new Cat(); // Полиморфизм: переменная типа Animal, но объект типа Cat

        // Вызов методов
        myDog.sound(); // Вывод: Собака лает
        myCat.sound(); // Вывод: Кошка мяукает

        // Пример полиморфизма с массивом объектов
        Animal[] animals = {myDog, myCat};
        for (Animal animal : animals) {
            animal.sound(); // В зависимости от типа объекта (Dog или Cat) будет вызван соответствующий метод
        }
    

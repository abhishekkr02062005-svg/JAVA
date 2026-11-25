// Program to demonstrate all major types of inheritance in Java

// 1. Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// 2. Multilevel Inheritance
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// 3. Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// 4. Multiple Inheritance using Interfaces
interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {
    @Override
    public void fatherProperty() {
        System.out.println("Father's property");
    }

    @Override
    public void motherProperty() {
        System.out.println("Mother's property");
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Single Inheritance
        System.out.println("Single Inheritance:");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Dog anotherDog = new Dog();
        anotherDog.eat();
        anotherDog.bark();

        // Multiple Inheritance using interfaces
        System.out.println("\nMultiple Inheritance using Interfaces:");
        Child child = new Child();
        child.fatherProperty();
        child.motherProperty();
    }
}

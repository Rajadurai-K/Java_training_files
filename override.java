// Parent class
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a generic sound.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    // The @Override annotation tells the compiler to verify the method signature
    // @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}
class Cat extends Animal {
    // The @Override annotation tells the compiler to verify the method signature
    @Override
    public void makeSound() {
        System.out.println("The Cat meow mewo!!!");
    }
}

public class override {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); 
        Animal myDog = new Dog(); // Polymorphic reference
        Cat catt = new Cat();

        myAnimal.makeSound(); // Output: The animal makes a generic sound.
        myDog.makeSound();    // Output: The dog barks: Woof! Woof!
        catt.makeSound();
    }
}

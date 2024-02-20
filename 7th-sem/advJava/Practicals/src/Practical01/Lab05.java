/*
Write a program to demonstrate single level, multi-level inheritance.
 */
package Practical01;

class Animal {
    public Animal() {
        System.out.println("This is Animal class.");
    }
}

class Mammal extends Animal {
    public Mammal() {
        System.out.println("This is Mammal class.");
    }
}

class Dog extends Mammal {
    public Dog() {
        System.out.println("This is Dog class.");
    }
}

public class Lab05 {
    public static void main(String[] args) {
        System.out.println("Single level inheritance.");
        Mammal m1 = new Mammal();

        System.out.println("Multi level inheritance.");
        Dog d1 = new Dog();
    }
}

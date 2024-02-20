/*
Provide example on method overriding condition
 */
package Practical01;

class Keyboard {
    void describe() {
        System.out.println("Keyboard has all alphabets as keys.");
    }
}

class MechanicalKeyboard extends Keyboard {
    void describe() {
        System.out.println("Mechanical keyboards are cool.");
    }
}
public class Lab09 {
    public static void main(String[] args) {
        MechanicalKeyboard mk = new MechanicalKeyboard();
        mk.describe();
    }
}

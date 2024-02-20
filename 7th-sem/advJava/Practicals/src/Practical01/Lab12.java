/*
Create an abstract class Calculation which has one normal method int add(int x, int y) which will
calculate the sum of x and y and return the results and one abstract method int mul (int x, int y) that
performs multiplication. Create a class Demo that inherit abstract class that implement all the
abstract method, and it have its own method int calcDiv(int x, int y) that calculates the division
between x and y and return the result. Now create the object of Demo and demonstrate the above
scenario. After this access the method of abstract class using reference of abstract class.
 */
package Practical01;

abstract class Calculation {
    int add(int x, int y) {
        return x + y;
    }

    abstract int mul(int x, int y);
}

class Demo extends Calculation {
    int mul(int x, int y) {
        return x * y;
    }

    int calcDiv(int x, int y) {
        return x / y;
    }
}

public class Lab12 {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println("Sum: " + d.add(30,30));
        System.out.println("Product: " + d.mul(4,5));
        System.out.println("Division: " + d.calcDiv(50,10));
    }
}

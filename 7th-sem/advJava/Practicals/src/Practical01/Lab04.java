/*
Write a program to demonstrate method overloading condition.
 */

package Practical01;

class TestMethod {
    void calculateSum(int x, int y) {
        System.out.println("Sum of " + x + " " + y + " is "+ (x + y));
    }

    void calculateSum(int x, int y, int z) {
        System.out.println("Sum of " + x + " " + y + " " + z + " is "+ (x + y + z));
    }
}
public class Lab04 {
    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.calculateSum(10, 20);
        tm.calculateSum(10, 20, 30);
    }
}

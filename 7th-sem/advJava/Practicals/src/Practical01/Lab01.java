/*
Write a program to create a class, instance variable, constructor and method. After this create a
class FirstDemo with main method and access the member of above class
 */

package Practical01;
public class Lab01 {
    public String title;

    public Lab01(String title) {
        this.title = title;
    }

    public void printTitle() {
        System.out.println("Title for lab 01: " + this.title);
    }
}

class FirstDemo {
    public static void main(String[] args) {
        Lab01 l1 = new Lab01("Basics of Java.");
        l1.printTitle();
    }
}

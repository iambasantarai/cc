/*
Demonstrate multiple inheritance using interface
 */
package Practical01;

interface A {
    void a();
}

interface B {
    void b();
}

class C implements A, B {
    public void a() {
        System.out.println("Function definition for a.");
    }

    public void b() {
        System.out.println("Function definition for b.");
    }
}

public class Lab13 {
    public static void main(String[] args) {
        C c = new C();
        c.a();
        c.b();
    }
}

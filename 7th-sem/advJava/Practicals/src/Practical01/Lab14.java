/*
. Demonstrate inheritance in interface (extending the interface)
 */
package Practical01;

import java.sql.SQLOutput;

interface Software {
    void display();
}

interface Application {
    void describe();
}

interface OfficePackage extends Software, Application {
    void use();
}

class Word implements OfficePackage {
    public void display() {
        System.out.println("This is a software.");
    }

    public void describe() {
        System.out.println("The software is application software.");
    }

    public void use() {
        System.out.println("Used in offices.");
    }
}

public class Lab14 {
    public static void main(String[] args) {
        Word w = new Word();
        w.display();
        w.describe();
        w.use();
    }
}

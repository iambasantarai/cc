/*
Provide an example of multi-level inheritance of your choice.
 */
package Practical01;

class University {
    public void callUniversity() {
        System.out.println("Tribhuwan University");
    }
}

class College extends University {
    public void callCollege() {
        System.out.println("Prime College.");
    }
}

class Faculty extends College {
    public void callFaculty() {
        System.out.println("CSIT");
    }
}
public class Lab07 {
    public static void main(String[] args) {
        Faculty f = new Faculty();
        System.out.println("Multi-level inheritance in action.");
        f.callUniversity();
        f.callCollege();
        f.callFaculty();
    }
}

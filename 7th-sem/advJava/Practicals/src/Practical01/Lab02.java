/*
Create a class Calculate which contains data member num1 and num2 both in integer and methods
setCalc() to set the data, calcSum() that calculate the sum of num1 and num2 and display the result,
calcMulti() that calculate the multiplication of num1 and num2 and returns the result, calcDifference
that calculate the difference between num1 and num2 and display the result. Now, create some
instance of Calculate and invoke all the methods.
 */

package Practical01;

class Calculate {
    public int num1, num2;

    void setCalc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void calcSum() {
        System.out.println("SUM: " + (num1 + num2));
    }
    void calcDifference() {
        System.out.println("DIFFERENCE: " + (num1 - num2));
    }
    int calcMulti() {
        return num1 * num2;
    }

}

public class Lab02 {
    public static void main(String[] args) {
        Calculate c = new Calculate();
        c.setCalc(10, 5);
        c.calcSum();
        c.calcDifference();
        int product = c.calcMulti();
        System.out.println("PRODUCT: " + product);
    }
}

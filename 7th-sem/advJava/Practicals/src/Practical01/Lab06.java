/*
Provide an example of single inheritance of your choice. (Two child class inheriting single parent class)
 */
package Practical01;

class Vehicle {
    public void callVehicle() {
        System.out.println("The vehicles have wheels to move.");
    }
}

class TwoWheeler extends Vehicle {
    public TwoWheeler() {
        System.out.println("Two wheeler vehicles have 2 wheels.");
    }
}

class FourWheeler extends Vehicle {
    public FourWheeler() {
        System.out.println("Four wheeler vehicles have 4 wheels.");
    }
}

public class Lab06 {
    public static void main(String[] args) {
        TwoWheeler bike = new TwoWheeler();
        bike.callVehicle();

        FourWheeler car =  new FourWheeler();
        car.callVehicle();
    }
}

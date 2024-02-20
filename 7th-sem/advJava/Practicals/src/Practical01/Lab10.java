/*
Provide example on dynamic method dispatch
 */
package Practical01;

class Internet {
    void enable() {
        System.out.println("Turning on an internet.");
    }
}

class DataPack extends Internet {
    void enable() {
        System.out.println("Internet is enabled using data pack.");
    }
}

class Wifi extends  Internet {
    void enable() {
        System.out.println("Internet is enabled using wifi.");
    }
}
public class Lab10 {
    public static void main(String[] args) {
        DataPack dp = new DataPack();
        dp.enable();

        Wifi wifi = new Wifi();
        wifi.enable();
    }
}

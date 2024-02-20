/*
Write a program to demonstrate multithreading using both Thread class and Runnable interface.
 */
package Practical01;

// Using threads
class NumberPrinter extends Thread {
    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println("Number: "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ie){
                System.out.println("ERROR: " + ie);
            }
        }
    }
}

class EvenNumberPrinter extends Thread {
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                System.out.println("Even number: " + i);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ie){
                    System.out.println("ERROR: " + ie);
                }
            }
        }
    }
}

public class Lab15a {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        EvenNumberPrinter enp = new EvenNumberPrinter();

        np.start();
        enp.start();
    }
}

package Unit1;
/*
    - using multithreading a program can do multiple task at same time
    - there are 2 ways to use multiple threads in java
 */
// Using thread

class NumberPrinter extends Thread {
    @Override
    public void run(){
        for(int i = 1; i <= 20; i++){
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
        for(int i = 1; i <= 50; i++){
            if(i%2==0){
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

public class DemoThreading {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        EvenNumberPrinter enp = new EvenNumberPrinter();

        np.start();
        enp.start();
    }
}

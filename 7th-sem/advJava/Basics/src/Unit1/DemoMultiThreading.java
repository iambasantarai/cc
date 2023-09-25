package Unit1;
// Using runnable interface

class Printer implements Runnable{
    @Override
    public void run(){
        for(int i=1; i <= 50; i++){
            if(i % 2 == 0){
                System.out.println("Printing: " + i);
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException ie){
                    System.out.println("ERROR: " + ie);
                }
            }
        }
    }
}
class SecondPrinter implements Runnable{
    @Override
    public void run(){
        for(int i=1; i <= 50; i++){
            System.out.println("Printing second time : " + i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException ie){
                System.out.println("ERROR: " + ie);
            }

        }
    }
}

public class DemoMultiThreading {
    public static void main(String[] args) {
        Printer p1 = new Printer();
        SecondPrinter p2 = new SecondPrinter();

        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();
    }
}

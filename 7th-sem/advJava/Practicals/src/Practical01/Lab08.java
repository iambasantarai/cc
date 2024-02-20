/*
Provide example on how constructor of super class is called.
 */
package Practical01;

class VideoGame {
    public VideoGame() {
        System.out.println("Video Games are played virtually.");
    }
}

class PUBG extends VideoGame {
    public PUBG() {
        super();
        System.out.println("PUBG is also a Video Game.");
    }
}
public class Lab08 {
    public static void main(String[] args) {
        PUBG pubg = new PUBG();
    }
}

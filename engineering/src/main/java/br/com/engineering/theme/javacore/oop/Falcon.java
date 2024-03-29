package br.com.engineering.theme.javacore.oop;

import static java.lang.System.out;

public class Falcon extends Food implements Birds {
    @Override
    public void move() {
        out.print("Fly");
    }

    @Override
    public void sound() {
        out.print("shrill");
    }

    @Override
    public String birdFood() {
        return "meat";
    }


}

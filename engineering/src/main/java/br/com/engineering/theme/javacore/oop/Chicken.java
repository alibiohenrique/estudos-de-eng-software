package br.com.engineering.theme.javacore.oop;

import static java.lang.System.out;

public class Chicken extends Food implements Birds {
    @Override
    public void move() {
        out.print("Running");
    }

    @Override
    public void sound() {
        out.print("cluck");
    }

    @Override
    public String birdFood() {
        return "corn";
    }
}

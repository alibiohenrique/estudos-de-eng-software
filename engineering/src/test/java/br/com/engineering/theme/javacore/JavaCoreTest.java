package br.com.engineering.theme.javacore;

import br.com.engineering.theme.javacore.oop.Chicken;
import br.com.engineering.theme.javacore.oop.Falcon;
import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JavaCoreTest {

    @Test
    public void oopExample() {
        Falcon falcon = new Falcon();
        out.print("Falcon move: ");
        falcon.move();
        out.println();
        out.print("Falcon sound: ");
        falcon.sound();
        out.println();
        out.println("Falcon eats: " + falcon.birdFood());
        out.print("Falcon like: ");
        falcon.drinkWater();
        out.println();

        Chicken chicken = new Chicken();
        out.print("Chicken move: ");
        chicken.move();
        out.println();
        out.print("Chicken sound: ");
        chicken.sound();
        out.println();
        out.println("Chicken eats: " + chicken.birdFood());
        out.print("Chicken like: ");
        chicken.drinkWater();

        assertTrue(true);
    }
}

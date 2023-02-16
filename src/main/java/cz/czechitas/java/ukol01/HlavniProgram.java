package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {


    public void start() {
        Turtle zofka = new Turtle();

        nakresliPrasatko(zofka);

    }



    private static void nakresliPrasatko(Turtle zofka) {
        double b = 50;
        double c = 25;
        double a = 2*Math.sqrt(b*b+b*b);
        nakresliNohy(zofka);
        zofka.turnLeft(180);
        zofka.move(c);
        zofka.turnRight(45);
        nakresliCtverec(zofka);
        zofka.turnLeft(90);
        nakresliStrizku(zofka);
        zofka.turnRight(45);
        zofka.penUp();
        zofka.move(a);
        zofka.turnRight(90);
        zofka.move(c);
        zofka.turnRight(135);
        zofka.penDown();
        nakresliNohy(zofka);
    }

    private static void nakresliCtverec(Turtle zofka) {
        double b = 50;
        for (int i = 0; i < 4; i++) {
            zofka.move(b*2);
            zofka.turnRight(90);
        }
    }
    private static void nakresliStrizku(Turtle zofka) {
        double b = 50;
        double a = Math.sqrt(b*b+b*b);

        zofka.turnRight(45);
        zofka.move(a);
        zofka.turnRight(90);
        zofka.move(a);
        zofka.turnRight(45);
    }

    private static void nakresliNohy(Turtle zofka) {
        double c = 25;
        zofka.turnRight(45);
        zofka.move(c);
        zofka.turnRight(90);
        zofka.move(c);

    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

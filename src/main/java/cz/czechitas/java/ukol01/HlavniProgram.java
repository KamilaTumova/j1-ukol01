package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {


    public void start() {
        Turtle zofka = new Turtle();
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(300);
        zofka.turnLeft(45);
        zofka.move(50);
        zofka.penDown();
        nakresliSlunicko(zofka);

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(120);
        zofka.turnRight(135);
        zofka.penDown();

       for (int i = 0; i < 5; i++) {
            nakreslidomecek(zofka);
            zofka.turnLeft(90);
            zofka.penUp();
            zofka.move(50);
            zofka.turnLeft(90);
            zofka.penDown();
       }
       zofka.penUp();
       zofka.turnLeft(90);
       zofka.move(150);
       zofka.turnLeft(90);
       zofka.move(170);
       zofka.turnLeft(180);
       zofka.penDown();

        nakreslidomecek(zofka);

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(700);
        zofka.turnRight(90);
        zofka.penDown();

        nakreslidomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(150);
        zofka.turnLeft(135);
        zofka.penDown();
        nakresliPrasatko(zofka);

        zofka.penUp();
        zofka.turnRight(135);
        zofka.move(250);
        zofka.turnLeft(90);
        zofka.move(20);




//        nakresliSlunicko(zofka);

    }





    private static void nakreslidomecek(Turtle zofka) {
        nakresliStrizku(zofka);
        nakresliCtverec(zofka);
    }
    private static void nakresliSlunicko(Turtle zofka) {


        for (int i = 0; i < 9; i++) {
            zofka.turnLeft(90);
            zofka.move(10);
            zofka.turnLeft(180);
            zofka.move(10);
            zofka.turnLeft(100);
            zofka.turnRight(20);
            zofka.move(10);
            zofka.turnRight(20);
            zofka.move(10);
            zofka.turnRight(10);
        }

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

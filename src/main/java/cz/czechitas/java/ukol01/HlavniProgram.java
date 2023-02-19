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
        zofka.move(120);
        zofka.turnRight(180);

       nakresliK(zofka);
       nakresliA(zofka);
       nakresliM(zofka);
       nakresliI(zofka);
       nakresliL(zofka);
       nakresliA(zofka);

    }

    private static void nakresliL(Turtle zofka) {
        double a = 100;
        zofka.penDown();
        zofka.move(a);
        zofka.turnRight(180);
        zofka.move(a);
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private static void nakresliI(Turtle zofka) {
        double a = 100;
        zofka.penDown();
        zofka.move(a);
        zofka.turnRight(180);
        zofka.move(a);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private static void nakresliM(Turtle zofka) {
        double a = 100;
        double b = 30;
        double ang = 40;
        zofka.penDown();
        zofka.move(a);
        zofka.turnRight(90+ang);
        zofka.move(b);
        zofka.turnLeft(2*ang);
        zofka.move(b);
        zofka.turnRight(90+ang);
        zofka.move(a);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private static void nakresliA(Turtle zofka) {
        double ang = 10;
        double radians = Math.toRadians(ang);
        double a = 100;
        double b = (a)/(Math.cos(radians));
        double c = 2*((b/2)*(Math.sin(radians)));
        zofka.penDown();
        zofka.turnRight(ang);
        zofka.move(b);
        zofka.turnRight(180-2*ang);
        zofka.move(b);
        zofka.turnRight(180);
        zofka.move(b/3);
        zofka.turnLeft(90-ang);
        zofka.move(c);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(c);
        zofka.turnRight(90-ang);
        zofka.move(b/3);
        zofka.turnLeft(90-ang);
        zofka.move(20);
        zofka.turnLeft(90);
    }

    private static void nakresliK(Turtle zofka) {
        double ang = 30;
        double radians = Math.toRadians(ang);
        double a = 100;
        double b = (int)(a/2)/(Math.cos(radians));
        zofka.penDown();
        zofka.move(a);
        zofka.turnRight(180);
        zofka.move(a/2);
        zofka.turnLeft(180-ang);
        zofka.move(b);
        zofka.turnRight(180);
        zofka.move(b);
        zofka.turnLeft(2*ang);
        zofka.move(b);
        zofka.turnLeft(90-ang);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);
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

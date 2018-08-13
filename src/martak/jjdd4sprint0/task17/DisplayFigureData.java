package martak.jjdd4sprint0.task17;

import java.text.DecimalFormat;

public class DisplayFigureData {

    public static void displayFigureDate(Figure figure) {

        final DecimalFormat dec = new DecimalFormat("#0.00");

        if (figure.getClass().equals(Circle.class)) {
            System.out.println("Koło");
        } else if (figure.getClass().equals(Triangle.class)) {
            System.out.println("Trójkąt");
        } else if (figure.getClass().equals(Rectangle.class)) {
            System.out.println("Prostokąt");
        }

        System.out.println("|---------|-----------|");
        System.out.println("|  POLE   |   OBWÓD   |");
        System.out.println("|---------|-----------|");
        System.out.println("|  " + dec.format(figure.calculateArea())
                + "  |   " + dec.format(figure.calculatePerimeter()) + "   |");
        System.out.println("|---------|-----------|");
        System.out.println();

    }
}

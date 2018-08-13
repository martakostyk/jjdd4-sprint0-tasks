package martak.jjdd4sprint0.task17;

public class Main {
    public static void main(String[] args) {

        Figure figure = new Circle(3);
        DisplayFigureData.displayFigureDate(figure);

        Figure figure1 = new Rectangle(4,2);
        DisplayFigureData.displayFigureDate(figure1);

        Figure figure2 = new Triangle(5,4,6.8);
        DisplayFigureData.displayFigureDate(figure2);

    }
}

package Entity.Types;

import Entity.NoteBook;

public class GameNoteBook extends NoteBook {


    public GameNoteBook(String name, String country, float rating) throws Exception {
        super(name, country, rating);
    }

    public GameNoteBook(String name, String country, float rating, double cost, double weight, double display, String color) throws Exception {
        super(name, country, rating, cost, weight, display, color);
    }

    @Override
    public void toString(double cost, double weight, double diagonal, String color) {
        System.out.printf("Parameters: cost: %f, weight: %f, diagonal: %f, color: %s", cost,weight,diagonal,color);
    }
}

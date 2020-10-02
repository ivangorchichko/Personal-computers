package Entity;

import Service.INoteBook;


public abstract class NoteBook extends Company implements INoteBook {

    private String color;
    private double cost;
    private double weight;
    private double diagonal;

    public NoteBook(String name, String country, float rating) throws Exception {
        super(name,country,rating);
    }

    public NoteBook(String name, String country, float rating, double cost, double weight, double display, String color) throws Exception {
        super(name,country,rating);
        this.cost = cost;
        this.weight = weight;
        this.diagonal = display;
        this.color = color;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    @Override
    public void toString(double cost, double weight, double diagonal, String color)
    {
        System.out.printf("Parameters: cost: %f, weight: %f, diagonal: %f, color: %s", cost,weight,diagonal,color);
    }
}


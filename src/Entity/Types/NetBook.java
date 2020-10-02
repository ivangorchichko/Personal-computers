package Entity.Types;

import Entity.NoteBook;

public class NetBook extends NoteBook
{
    public NetBook(String name,String country, float rating,double cost, double weight, double diagonal, String color) throws Exception {
        super(name,country,rating,cost, weight, diagonal, color);

    }

    public NetBook(String name, String country, float rating) throws Exception {
        super(name, country, rating);
    }

    @Override
    public void toString(double cost, double weight, double diagonal, String color) {
        System.out.printf("Parameters: cost: %f, weight: %f, diagonal: %f, color: %s", cost,weight,diagonal,color);
    }

    public void toString(String name,String country, float rating,double cost, double weight, double diagonal, String color){
        System.out.printf("NetBook company is %s, which made in %s, rating: %f/10.0.\n Parameters: cost: %f, weight: %f, diagonal: %f, color: %s", name,country,rating,cost,weight,diagonal,color);
    }
}

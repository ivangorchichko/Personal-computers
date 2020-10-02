package Entity;

public class Company {
    private String name;
    private String country;
    private float rating;

    public Company(String name, String country, float rating) throws Exception {
        this.name = name;
        this.country = country;
        if(rating > 10.0 || rating < 0.0) throw new Exception("To match/low rating!") ;
        else this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }


    public void setCountry(String country) {
        this.country = country;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) throws Exception {
        if(rating > 10.0 || rating < 0.0) throw new Exception("To match/low rating!") ;
        else
        this.rating = rating;
    }

    public void getCompany()
    {
        System.out.printf("Company is %s, which made in %s, rating: %f/10.0 \n",getName(),getCountry(),getRating());
    }
}
